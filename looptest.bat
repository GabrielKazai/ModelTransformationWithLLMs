cls

set scriptpath=%~dp0

for /d %%i in ("F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\*") do call :Foo %%i
goto End

:Foo
set path=%1

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%combineOracle.py" %1

@echo Combine done

runGPT.ahk %1\xmiforgpt\Model.xmi %1\xmiforgpt\OutputFromGPTAHK.txt %1\xmiforgpt\OutputFromGPTAHKURL.txt

@echo GPT execution done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanOracle.py" %1\oracle\combinedOracle\combined_oracle_not_cleaned.java %1\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanGPT.py" %1\xmiforgpt\OutputFromGPTAHK.txt %1\xmiforgpt\cleanGPT.java 

@echo Clean GPT

@echo %1\xmiforgpt\cleanGPT.java 

@echo %1\oracle\combinedOracle\cleanOracle.java

formatJava.ahk %1\oracle\combinedOracle\cleanOracle.java %1\xmiforgpt\cleanGPT.java 

@echo Format done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\beyondCompareGenerateParameters.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\xmiforgpt\cleanGPT.java

"F:\Gabriel\Beyond Compare 4\BCompare.exe" "@%1\bScripts.txt"

@echo Comparison done

goto :eof
:End