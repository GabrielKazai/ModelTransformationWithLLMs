filepathGPT := A_Args[1]

Run, "C:\Users\Gabriel\AppData\Local\Programs\Microsoft VS Code\Code.exe" %filepathGPT%
sleep 15000
Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 1000

Send, {alt down} {f4 down}
Send, {alt up} {f4 up}

sleep 1000
