cls

set scriptpath=%~dp0

set workpath=F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\

@echo off
set /p input= Which file do you want to execute again (name of folder): 
echo Input is: %input%

set path=%workpath%%input%

echo Working path is: %path%

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%combineOracle.py" %path%

@echo Combine done

runGPT.ahk %path%\xmiforgpt\Model.xmi %path%\xmiforgpt\OutputFromGPTAHK.txt %path%\xmiforgpt\OutputFromGPTAHKURL.txt

@echo GPT execution done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanOracle.py" %path%\oracle\combinedOracle\combined_oracle_not_cleaned.java %path%\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanGPT.py" %path%\xmiforgpt\OutputFromGPTAHK.txt %path%\xmiforgpt\cleanGPT.java 

@echo Clean GPT done

formatJava.ahk %path%\oracle\combinedOracle\cleanOracle.java %path%\xmiforgpt\cleanGPT.java 

@echo Format done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\beyondCompareGenerateParameters.py" %path% %path%\oracle\combinedOracle\cleanOracle.java %path%\xmiforgpt\cleanGPT.java

@echo %path%
@echo "@%path%\bScripts.txt"
@echo "%path%\bScripts.txt"
@echo @%path%\bScripts.txt

"F:\Gabriel\Beyond Compare 4\BCompare.exe" "@%path%\bScripts.txt"

@echo Comparison done

echo %input% >> %scriptpath%\previousExecutions.txt

pause

