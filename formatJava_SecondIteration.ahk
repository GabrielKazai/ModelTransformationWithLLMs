filepathGPT := A_Args[1]

Run, "C:\Users\Gabriel\AppData\Local\Programs\Microsoft VS Code\Code.exe" %filepathGPT%
sleep 15000

Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 1000


