filepath := A_Args[1]
filepathOutput := A_Args[2]
filepathOutputURL := A_Args[3]

FileRead, myFile, %filepath%

Run, https://chat.openai.com/

sleep 5000

Clipboard := myFile

Send, The following is an XMI file based on a UML diagram. Please write corresponding Java code without adding any explanatory text before or after. Also, do not Implement get/set functions and do not add comments in the code. Generate the classes as if they were in separate files. Furthermore, start and end the response with the tag [[STARTEND]] as a java comment.
Send, {shift down}{Enter}
Send, {shift up}
Send, {Ctrl down}{v down}
Send, {Ctrl up}{v up}
Send, {Enter}

MouseMove, 960, 540

Loop, 700 {
 Send {WheelDown}
 Sleep, 100
}

sleep 100

Send, {TAB}
Send, {Ctrl down}{a down}
Send, {Ctrl up}{a up}
sleep 1000
Send, {Ctrl down}{c down}
Send, {Ctrl up}{c up}

sleep 100

myBoard := Clipboard

FileObj := FileOpen(filepathOutput, "rw", "UTF-8")
FileObj.Write(Clipboard)

Send, {Ctrl down}{l down}
Send, {Ctrl up}{l up}
Send, {Ctrl down}{c down}
Send, {Ctrl up}{c up}

FileObjUrl := FileOpen(filepathOutputURL, "rw", "UTF-8")
FileObjUrl.Write(Clipboard)

Send, {alt down}{F4 down}
Send, {alt up}{F4 up}

return