filepathOracle := A_Args[1]
filepathGPT := A_Args[2]

Run, "C:\Users\gkaza\AppData\Local\Programs\Microsoft VS Code\Code.exe" %filepathOracle%
sleep 15000
Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 1000

Run, "C:\Users\gkaza\AppData\Local\Programs\Microsoft VS Code\Code.exe" %filepathGPT%
sleep 7000
Send, {ctrl down}{s down}
Send, {ctrl up}{s up}


