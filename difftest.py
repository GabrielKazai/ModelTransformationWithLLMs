import difflib
 
with open('cleanOracle.java') as file_1:
    file_1_text = file_1.readlines()
 
with open('CleanGPT.java') as file_2:
    file_2_text = file_2.readlines()
 
# Find and print the diff:
for line in difflib.unified_diff(
        file_1_text, file_2_text, fromfile='cleanOracle.java', 
        tofile='CleanGPT.java', lineterm=''):
    print(line)