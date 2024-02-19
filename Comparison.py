import json


def parseFromGPT():
    #read and parse gpt 
    file = open('OutputFromGPTAHK.txt', 'r')
    fileListGPT = file.readlines()
    file.close()
    correctBit = False
    saveJavaGPT = []
    c = 0

    for line in fileListGPT:
        if correctBit == True and c < 3:
            if '[[STARTEND]]' not in line:
                saveJavaGPT.append(line.strip())

        if '[[STARTEND]]' in line:
            c += 1
            if c != 1:
                print("Found [[STARTEND]]")
                correctBit = True

    #print(saveJavaGPT)
    donelistGPT = []

    for j in saveJavaGPT:
        for t in j.split():
            donelistGPT.append(t)
    print(donelistGPT)
    return donelistGPT

def parseFromOracle():
    #read and parse oracle -----------------
    file = open('input_oracle.java', 'r')
    fileListOracle = file.readlines()
    file.close()
    saveJavaOracle = []
    donelistOracle = []

    for l in fileListOracle:
        if not l.strip().startswith('import') and not l.strip().startswith('@objid'):
            saveJavaOracle.append(l.strip())

    print(saveJavaOracle)

    for k in saveJavaOracle:
        for l in k.split():
            donelistOracle.append(l)

    print(donelistOracle)
    return donelistOracle

def decideCollectionType(donelist):
    typeCollection = "Collection"
    if "List" in donelist:
        typeCollection += donelist.split('<')[1].split('>')[0]
        typeCollection += "," + donelist
        return typeCollection
    elif "[]" in donelist:
        typeCollection += donelist.split('[')[0]
        typeCollection += "," + donelist
        return typeCollection
    return donelist

def objectGPT(donelistGPT):
    classesGPT = []
    i = 0
    while i < len(donelistGPT):
        if donelistGPT[i] == 'class':
            nameindex = i+1
            variables = []
            while donelistGPT[i] != '{':
                i += 1
            while donelistGPT[i+1] != '}':
                if donelistGPT[i+1] == 'private' or donelistGPT[i+1] == 'public':
                    resultOfCollectionType = decideCollectionType(donelistGPT[i+2])
                    var = {'accessor': donelistGPT[i+1], 'type': resultOfCollectionType, 'name': donelistGPT[i+3].split(';')[0]}
                    i += 3
                    variables.append(var)
                else:
                    resultOfCollectionType = decideCollectionType(donelistGPT[i+1])
                    var = {'accessor': '', 'type': resultOfCollectionType, 'name': donelistGPT[i+2].split(';')[0]}
                    i += 2
                    variables.append(var)

            if donelistGPT[nameindex-2] == 'private' or donelistGPT[nameindex-2] == 'public' or donelistGPT[nameindex-2] == 'abstract':       
                pushing = {'accessor': donelistGPT[nameindex-2], 'class': donelistGPT[nameindex], 'variables': variables}
            else:
                pushing = {'accessor': '', 'class': donelistGPT[nameindex], 'variables': variables}
            classesGPT.append(pushing)
        else:
            i += 1

    print(classesGPT)
    return classesGPT

def setAssignment(donelist, i, st):
    i += 1 
    while donelist[i][-1] != ';':
        st += donelist[i] + ' '
        i += 1
    st += donelist[i]

    return st, i
    
def objectOracle(donelistOracle):
    classesOracle = []
    i = 0
    while i < len(donelistOracle):
        if donelistOracle[i] == 'class':
            nameindex = i+1
            variables = []
            while donelistOracle[i] != '{':
                i += 1
            while donelistOracle[i+1] != '}':
                if donelistOracle[i+1] == 'private' or donelistOracle[i+1] == 'public':
                    st = ''
                    accessor = donelistOracle[i+1]
                    resultOfCollectionType = decideCollectionType(donelistOracle[i+2])
                    type = donelistOracle[i+2]
                    name = donelistOracle[i+3].split(';')[0]
                    i += 3
                    try: 
                        if donelistOracle[i+1] == '=':
                            st1, j = setAssignment(donelistOracle, i, st)
                            i = j
                            st = st1
                    except IndexError:
                        pass
                    var = {'accessor': accessor, 'type': resultOfCollectionType, 'name': name, 'assignment': st}
                    variables.append(var)
                else:
                    st = ''
                    accessor = ''
                    #type = donelistOracle[i+1]
                    resultOfCollectionType = decideCollectionType(donelistOracle[i+1])
                    name = donelistOracle[i+2].split(';')[0]
                    i += 2
                    try: 
                        if donelistOracle[i+1] == '=':
                            st1, j = setAssignment(donelistOracle, i, st)
                            i = j
                            st = st1
                    except IndexError:
                        pass
                    var = {'accessor': accessor, 'type': resultOfCollectionType, 'name': name, 'assignment': st}
                    variables.append(var)

            if donelistOracle[nameindex-2] == 'private' or donelistOracle[nameindex-2] == 'public' or donelistOracle[nameindex-2] == 'abstract':       
                pushing = {'accessor': donelistOracle[nameindex-2], 'class': donelistOracle[nameindex], 'variables': variables}
            else:
                pushing = {'accessor': '', 'class': donelistOracle[nameindex], 'variables': variables}
            classesOracle.append(pushing)
        else:
            i += 1

    print(classesOracle)
    return classesOracle

def comparison(classesGPT, classesOracle):
    for i in classesOracle:
        found = False
        for j in classesGPT:
            if i["class"] == j["class"]:
                found = True
                if not i["accessor"] == j["accessor"]: #check if accessor is different within class 
                    print("accessor for class " + i["class"] + " are different")
                if not i["variables"] == j["variables"]: #check if the variables within a class are different 
                    print("variables for class " + i["class"] + " are different, going deeper")
                    for k in i["variables"]: #go through the variables within the classes
                        for t in j["variables"]:
                            if k["type"] == t["type"]: #check if specific variable exists
                                if not k["name"] == t["name"]: #the names are different
                                    if k["name"].upper() == t["name"].upper():
                                        print("the capitlization for the variable " + k["name"] + " is different, Oracle name: "+ k["name"] +  " ChatGPT: " + t["name"])
                                    else:
                                        print("the names for the variable " + k["name"] + " is different, Oracle name: "+ k["name"] +  " ChatGPT: " + t["name"])
                                if not k["accessor"] == t["accessor"]: #accessor of variables
                                    print("accessor for the variable " + k["name"] + " within class " + k["class"] + " are different, Oracle accessor: "+ k["accessor"] +  "ChatGPT: " + t["accessor"])
                            elif k["type"].split(",")[0] == t["type"].split(",")[0]:
                                if not k["name"] == t["name"]: #the names are different
                                    if k["name"].upper() == t["name"].upper():
                                        print("the capitlization for the variable " + k["name"] + " is different, Oracle name: "+ k["name"] +  " ChatGPT: " + t["name"])
                                    else:
                                        print("the names for the variable " + k["name"] + " is different, Oracle name: "+ k["name"] +  " ChatGPT: " + t["name"])
                                if not k["accessor"] == t["accessor"]: #accessor of variables
                                    print("accessor for the variable " + k["name"] + " within class " + k["class"] + " are different, Oracle accessor: "+ k["accessor"] +  "ChatGPT: " + t["accessor"])
                                if not k["type"].split(",")[1] == t["type"].split(",")[1]:
                                    print("The original collections were not the same, Oracle: " +  k["type"].split(",")[1] + "ChatGPT: " + t["type"].split(",")[1])
                 
        if not found:
            print("The class " + i["class"] + " does not exist within the generated solution")


def main():
    donelistGPT = parseFromGPT()
    donelistOracle = parseFromOracle()
    classesGPT = objectOracle(donelistGPT)
    classesOracle = objectOracle(donelistOracle)
    result = comparison(classesGPT, classesOracle)

    print("done")

if __name__ == '__main__':
    main()

