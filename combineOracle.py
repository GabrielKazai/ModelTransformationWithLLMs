import os
cwd = os.getcwd()
print(cwd)
data = ""
content = []

files = [f for f in os.listdir(cwd) if os.path.isfile(f)]
for f in files:
    if f.endswith('.java'):
        print(f)
        with open(f) as fp:
            content.append(fp.read() + "\n")

print(content)

for i in content:
    data += i

file = open('input_oracle.java', 'w')
file.write(data)
file.close()
