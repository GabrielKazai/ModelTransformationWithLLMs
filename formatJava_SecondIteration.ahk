filepathGPT := A_Args[1]

Run, "[[YOURVSCODEPATHHERE]]" %filepathGPT%
sleep 15000

Send, {ctrl down}{s down}
Send, {ctrl up}{s up}

sleep 1000


