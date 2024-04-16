comparisonFile := A_Args[1]
filepathOutput := A_Args[2]
filepathOutputURL := A_Args[3]

FileRead, myFile, %comparisonFile%

FileRead, myURL, %filepathOutputURL%

Run, %myURL%

sleep 5000

Clipboard := myFile

Send, In your previous iteration, the following errors were discovered. Please regenerate the response fixing the listed errors:  
Send, {shift down}{Enter}
Send, {shift up}
Send, {Ctrl down}{v down}
Send, {Ctrl up}{v up}
Send, {Enter}

MouseMove, 960, 540

Loop, 1200 {
 Send {WheelDown}
 Sleep, 100
}

sleep 100

Send, {TAB}
Send, {Ctrl down}{a down}
Send, {Ctrl up}{a up}
sleep 2000
Send, {Ctrl down}{c down}
Send, {Ctrl up}{c up}

sleep 100

myBoard := Clipboard

FileObj := FileOpen(filepathOutput, "rw", "UTF-8")
FileObj.Write(Clipboard)

Send, {alt down}{F4 down}
Send, {alt up}{F4 up}

return