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


#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\thirdIteration\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\thirdIteration\failed


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

total = len(classes) + len(primtiveTypes) + len(enumerations) + len(Associations)
f = open("difficulty.txt", "a")
f.write("Classes: " + len(classes))
f.write("Primitive types: " + len(primtiveTypes))
f.write("Enumerations: " + len(enumerations))
f.write("Interfaces: " + len(Interfaces))
f.write("Associations: " + len(Associations))
f.write("Total: " + total)
f.close()








