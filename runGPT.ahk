filepath := A_Args[1]
filepathOutput := A_Args[2]
filepathOutputURL := A_Args[3]

FileRead, myFile, %filepath%

Run, https://chat.openai.com/

sleep 5000

Clipboard := myFile

Send, The following is an XMI file based on a UML diagram, please write corresponding Java code without adding any explanatory text before or after, get/set functions or comments in the code, please generate the classes as if they were in separate files, furthermore, start and end the response with the tag [[STARTEND]] as a java comment:
Send, {shift down}{Enter}
Send, {shift up}
Send, {Ctrl down}{v down}
Send, {Ctrl up}{v up}
Send, {Enter}

sleep 30000	

Send, {TAB}
Send, {Ctrl down}{a down}
Send, {Ctrl up}{a up}
Send, {Ctrl down}{c down}
Send, {Ctrl up}{c up}

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