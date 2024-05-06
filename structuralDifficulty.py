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
total = []

def goThroughXMI(path, iteration, filename):

    classes.clear()
    primtiveTypes.clear()
    Interfaces.clear()
    enumerations.clear()
    Associations.clear()
    total.clear()

    for dirs in os.listdir(path):
        classes.clear()
        primtiveTypes.clear()
        Interfaces.clear()
        enumerations.clear()
        Associations.clear()
        total.clear()
        f = os.path.join(path, dirs)

        print(f)

        xmifile = open(f + "/gpt/xmiforgpt/Model.xmi", "r")

        for line in xmifile:
            if ("<packagedElement" in line and 'xmi:type="uml:Class"' in line):
                classes.append(line)
                total.append(line)
            elif(("<packagedElement" in line and 'xmi:type="uml:PrimitiveType"' in line)):
                primtiveTypes.append(line)
                #total.append(line)
            elif(("<packagedElement" in line and 'xmi:type="uml:Enumeration"' in line)):
                enumerations.append(line)
                #total.append(line)
            elif(("<packagedElement" in line and 'xmi:type="uml:Interface"' in line)):
                Interfaces.append(line)
                #total.append(line)
            elif(("<packagedElement" in line and 'xmi:type="uml:Association"' in line)):
                Associations.append(line)
                total.append(line)

        f = open(filename, "a")
        f.writelines(str(len(classes)) + "," + str(len(primtiveTypes)) + "," + str(len(enumerations)) + "," + str(len(Interfaces)) + "," + str(len(Associations)) + "," + str(len(total)) + "," + dirs + "," + iteration + "\n")
        f.close()


#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\thirdIteration\done
#F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\thirdIteration\failed
f = open("difficulty.csv", "a")
f.writelines("Classes, Primitive types, Enumerations, Interfaces, Associations, Total, Name, Iteration\n")
f.close()
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\done", "First Iteration - done", "difficulty.csv")
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\done", "Second Iteration - done", "difficulty.csv")
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\thirdIteration\\done", "Third Iteration - done", "difficulty.csv")
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\thirdIteration\\failed", "Third Iteration - failed", "difficulty.csv")
#-----------------------------
f = open("firstIterationDone.csv", "a")
f.writelines("Classes, Primitive types, Enumerations, Interfaces, Associations, Total, Name, Iteration\n")
f.close()
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\done", "First Iteration - done", "firstIterationDone.csv")

f = open("secondIterationDone.csv", "a")
f.writelines("Classes, Primitive types, Enumerations, Interfaces, Associations, Total, Name, Iteration\n")
f.close()
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\done", "Second Iteration - done", "secondIterationDone.csv")


f = open("thirdterationDone.csv", "a")
f.writelines("Classes, Primitive types, Enumerations, Interfaces, Associations, Total, Name, Iteration\n")
f.close()
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\thirdIteration\\done", "Third Iteration - done", "thirdterationDone.csv")


f = open("thirdterationFailed.csv", "a")
f.writelines("Classes, Primitive types, Enumerations, Interfaces, Associations, Total, Name, Iteration\n")
f.close()
goThroughXMI("F:\\Gabriel\\github_desktop\\ModelTransformationWithLLMs\\allXMI\\works\\secondIteration\\thirdIteration\\failed", "Third Iteration - failed", "thirdterationFailed.csv")










