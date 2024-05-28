filepathOracle := A_Args[1]
filepathGPT := A_Args[2]

Run, "code" %filepathOracle%
sleep 15000
Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 1000

Run, "code" %filepathGPT%
sleep 7000

Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 2000
