import sys

f = open(sys.argv[1], "r")
final = open(sys.argv[2], "w")
towrite = []
duplicates = []

for i in f:
    if not ("@objid" in i or "com." in i or "@DataType" in i):
        if "import" in i:
             pass
        else:
                towrite.append(i)    

for write in towrite:
    final.write(write)


