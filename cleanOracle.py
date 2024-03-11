import sys

f = open(sys.argv[1], "r")
final = open(sys.argv[2], "w")
towrite = []
duplicates = []

for i in f:
    if not ("@objid" in i or "com." in i):
        if "import" in i:
            if i not in duplicates:
                towrite.append(i)
                duplicates.append(i)
        else:
                towrite.append(i.rstrip())    

for write in towrite:
    final.write(write)


