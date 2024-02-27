import os
cwd = os.getcwd()
print(cwd)
workingdirectory = cwd + "\\allXMI\\works"

for root, dirs, files in os.walk(workingdirectory):
    filelist = []
    for file in files:
        if file.endswith(".java"):
            filelist.append(file)

    if (filelist) and (not root.endswith("combinedOracle")) and (not root.endswith("xmiforgpt")):
        data = ""
        content = []

        xmilist = []
        forgpt = root.replace("oracle", "xmiforgpt")
        xmifile = open(forgpt + "\\Model.xmi", "r")

        for line in xmifile:
            if "<packagedElement" in line and 'xmi:type="uml:Class"' in line:
                xmilist.append(line)

        print(xmilist)

        namesofXMI = []
        for i in xmilist:
            x = i.find("name=")
            namesofXMI.append(i[x+6:].split('"')[0])

        print(namesofXMI)

        files = [f for f in os.listdir(root) if os.path.isfile(f)]
        for i in namesofXMI:
            for f in files:
                if f == i + ".java":
                    print(f)
                    with open(f) as fp:
                        content.append(fp.read() + "\n")
                        break

        for i in content:
            data += i

        file = open(root + '\\combinedOracle\\combined_oracle_not_cleaned.java', 'w')
        file.write(data)
        file.close()
