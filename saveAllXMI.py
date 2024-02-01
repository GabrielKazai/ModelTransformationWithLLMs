import urllib.request
import sys
import requests
import re
from urllib.request import Request, urlopen
from urllib.error import URLError, HTTPError
import os

listOfLinks = []
htmlList = []
finalList = []

with open('removebeforeerror.txt') as file:
    for line in file:
        t = line.split(',')
        #print(t[1].rstrip())
        listOfLinks.append(t[1].rstrip())

for url in listOfLinks:
    try:
        fp = urllib.request.urlopen((url.replace(" ", "%20")).rstrip())
    except HTTPError as e:
        # do something
        pass
    except URLError as e:
        # do something
        pass
    else:
        mybytes = fp.read()

        mystr = mybytes.decode("utf8")
        pattern = r"((((\"rawBlobUrl\":\"https?|gopher|telnet|nntp)://)|news:)([-%()_.!~*';/?:@&=+$,A-Za-z0-9])+)"

        v = re.findall(pattern, mystr)
        print(v)

        res = v[0][0].split('"')

        print(res[3])

        filename = res[3].split('/')
        fileNAME = filename[-1]

        i = 0
        newname = fileNAME
        while os.path.isfile('./allXMI/' + newname):
            newname = str(i) + fileNAME
            i += 1

        urllib.request.urlretrieve(res[3], "./allXMI/" + newname)







