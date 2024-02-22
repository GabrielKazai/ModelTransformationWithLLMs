f = open("input_oracle.java", "r")
final = open("Oracle.java", "w")
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


