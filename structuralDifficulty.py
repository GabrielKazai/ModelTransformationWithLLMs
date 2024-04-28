import os
import sys
from pathlib import Path
cwd = os.getcwd()
print(cwd)
data = ""
content = []

xmilist = []
classes = []
primtiveTypes = []
Interfaces = []
enumerations = []
Associations = []

xmifile = open(sys.argv[1] + "/gpt/xmiforgpt/Model.xmi", "r")

for line in xmifile:
    if ("<packagedElement" in line and 'xmi:type="uml:Class"' in line):
        classes.append(line)
    elif(("<packagedElement" in line and 'xmi:type="uml:PrimitiveType"' in line)):
        primtiveTypes.append(line)
    elif(("<packagedElement" in line and 'xmi:type="uml:Enumeration"' in line)):
        enumerations.append(line)
    elif(("<packagedElement" in line and 'xmi:type="uml:Interface"' in line)):
        Interfaces.append(line)
    elif(("<packagedElement" in line and 'xmi:type="uml:Association"' in line)):
        Associations.append(line)

f = open("difficulty.txt", "a")
f.write("Classes: " + len(classes))
f.write("Primitive types: " + len(primtiveTypes))
f.write("Enumerations: " + len(enumerations))
f.write("Interfaces: " + len(Interfaces))
f.write("Associations: " + len(Associations))
f.close()








