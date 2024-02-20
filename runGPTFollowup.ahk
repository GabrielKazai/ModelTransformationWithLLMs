FileRead, myUrl, F:\Gabriel\github desktop\ModelTransformationWithLLMs\OutputFromGPTAHKURL.txt
FileRead, response, F:\Gabriel\github desktop\ModelTransformationWithLLMs\comparison.txt

Run, %myUrl%	

sleep 5000

Clipboard := response

Send, {shift down}{Enter}
Send, {shift up}
Send, {Ctrl down}{v down}
Send, {Ctrl up}{v up}
Send, {Enter}

sleep 15000	

Send, {TAB}
Send, {Ctrl down}{a down}
Send, {Ctrl up}{a up}
Send, {Ctrl down}{c down}
Send, {Ctrl up}{c up}

myBoard := Clipboard

FileObj := FileOpen("F:\Gabriel\github desktop\ModelTransformationWithLLMs\OutputFromGPTAHKSECONDITERATION.txt", "rw", "UTF-8")
FileObj.Write(Clipboard)

return