import json

file = open('OutputFromGPTAHK.txt', 'r')

fileList = file.readlines()

file.close()

correctBit = False
saveJava = []
c = 0

for line in fileList:
    if correctBit == True and c < 3:
        if '[[STARTEND]]' not in line:
            saveJava.append(line.strip())

    if '[[STARTEND]]' in line:
        c += 1
        if c != 1:
            print("Found [[STARTEND]]")
            correctBit = True

print(saveJava)

donelist = []

for j in saveJava:
    for t in j.split():
        donelist.append(t)

print(donelist)

classes = []
i = 0
while i < len(donelist):
    if donelist[i] == 'class':
        nameindex = i+1
        variables = []
        while donelist[i] != '{':
            i += 1
        while donelist[i+1] != '}':
            if donelist[i+1] == 'private' or donelist[i+1] == 'public':
                var = {'accessor': donelist[i+1], 'type': donelist[i+2], 'name': donelist[i+3]}
                i += 3
                variables.append(var)
            else:
                var = {'accessor': '', 'type': donelist[i+1], 'name': donelist[i+2]}
                i += 2
                variables.append(var)
        pushing = {'class': donelist[nameindex], 'variables': variables}
        classes.append(pushing)
    else:
        i += 1

print(classes)
print()







"""
i = 0
RowList = []
for row in saveJava:
   item = [
      {'line': i, 'row': row}
   ]
   i += 1
   RowList.append(item)

print(RowList)

"""
