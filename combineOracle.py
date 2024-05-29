import os
import sys
from pathlib import Path
cwd = os.getcwd()
print(cwd)
data = ""
content = []

xmilist = []
xmifile = open(sys.argv[1] + "/gpt/xmiforgpt/Model.xmi", "r")

for line in xmifile:
    if ("<packagedElement" in line and 'xmi:type="uml:Class"' in line) or ("<packagedElement" in line and 'xmi:type="uml:PrimitiveType"' in line) or ("<packagedElement" in line and 'xmi:type="uml:Enumeration"' in line) or ("<packagedElement" in line and 'xmi:type="uml:Interface"' in line):
        xmilist.append(line)

namesofXMI = []
for i in xmilist:
    x = i.find("name=")
    namesofXMI.append(i[x+6:].split('"')[0])

print(namesofXMI)

pathForOracle = sys.argv[1] + "/oracle/"
pathForOracleSave = sys.argv[1] + "/oracle/combinedOracle"

pathForOracle = Path(pathForOracle)


files = [f for f in os.listdir(pathForOracle) if os.path.isfile(os.path.join(pathForOracle, f))]
print(files)
for i in namesofXMI:
    print(i)
    for f in files:
        if f == i + ".java":
            print(f)
            print(Path(pathForOracle, f))
            with open(Path(pathForOracle, f)) as fp:
                content.append(fp.read() + "\n")
                break

for i in content:
    data += i

p = pathForOracleSave + '/combined_oracle_not_cleaned.java'

file = open(p, 'w')
file.write(data)
file.close()
