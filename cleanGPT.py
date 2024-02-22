
#read and parse gpt 
file = open('OutputFromGPTAHK.txt', 'r') #OutputFromGPTAHKSECONDITERATION
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

writeto = open('CleanGPT.java', "w")

for j in saveJavaGPT:
        writeto.write(j)
