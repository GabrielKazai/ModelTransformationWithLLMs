import os
cwd = os.getcwd()
print(cwd)
data = ""
content = []

xmilist = []
xmifile = open("input_xmi.xmi", "r")

for line in xmifile:
    if "<packagedElement" in line and 'xmi:type="uml:Class"' in line:
        xmilist.append(line)

print(xmilist)

namesofXMI = []
for i in xmilist:
    x = i.find("name=")
    namesofXMI.append(i[x+6:].split('"')[0])

print(namesofXMI)

files = [f for f in os.listdir(cwd) if os.path.isfile(f)]
for i in namesofXMI:
    for f in files:
        if f == i + ".java":
            print(f)
            with open(f) as fp:
                content.append(fp.read() + "\n")
                break

for i in content:
    data += i

file = open('input_oracle.java', 'w')
file.write(data)
file.close()
