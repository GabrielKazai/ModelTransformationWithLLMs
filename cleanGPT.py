import sys
#read and parse gpt 
file = open(sys.argv[1], 'r') #OutputFromGPTAHKSECONDITERATION
fileListGPT = file.readlines()
file.close()
correctBit = False
saveJavaGPT = []
c = 0

for line in fileListGPT:
    if correctBit == True and c < 3:
        if '[[STARTEND]]' not in line:
            saveJavaGPT.append(line.rstrip())

    if '[[STARTEND]]' in line:
        c += 1
        if c != 1:
            print("Found [[STARTEND]]")
            correctBit = True

#print(saveJavaGPT)
donelistGPT = []

writeto = open(sys.argv[2], "w")

for j in saveJavaGPT:
        writeto.write(j)
