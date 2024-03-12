import sys

with open(sys.argv[1], "r") as file:
    data = file.read()
    data = data.replace("[[GabrielRonnie]]", "")

with open(sys.argv[1], "w") as file:
    file.write(data)

    



