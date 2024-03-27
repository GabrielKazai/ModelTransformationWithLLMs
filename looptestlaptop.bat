cls
setlocal EnableDelayedExpansion
set scriptpath=%~dp0
set counter=0
set /p iter= How many iterations do you want to run (NR or ALL): 

for /d %%i in ("C:\Users\gkaza\Documents\GitHub\ModelTransformationWithLLMs\allXMI\works\*") do call :FIND %%i
goto End

:FIND
set "url=%1"

for %%a in ("%url%") do (
   set "urlPath=!url:%%~NXa=!"
   set "urlName=%%~NXa"
)
echo URL path: "%urlPath%"
echo URL name: "%urlName%"

find /c "%urlName%" previousExecutions.txt >NUL
    if %errorlevel% equ 0 (
        echo found 
		goto :eof
		) else (
        echo %urlName% is not within previousExecutions
		goto :Foo
		)

:Foo

if not %iter%==ALL (
	if !counter! == %iter% goto :End

	set /A counter=counter+1
)

"C:\Users\gkaza\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\python.exe" "%scriptpath%combineOracle.py" %1

@echo Combine done

runGPT.ahk %1\gpt\xmiforgpt\Model.xmi %1\gpt\gptoutput\OutputFromGPT.txt %1\gpt\gptoutput\OutputFromGPT_URL.txt

@echo GPT execution done

"C:\Users\gkaza\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\python.exe" "%scriptpath%\cleanOracle.py" %1\oracle\combinedOracle\combined_oracle_not_cleaned.java %1\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle done

"C:\Users\gkaza\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\python.exe" "%scriptpath%\cleanGPT.py" %1\gpt\gptoutput\OutputFromGPT.txt  %1\gpt\gptoutput\cleanGPT.java 

@echo Clean GPT done

formatJava.ahk %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT.java 

@echo Format done

"C:\Users\gkaza\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\python.exe" "%scriptpath%\removeAddedString.py" %1\oracle\combinedOracle\cleanOracle.java

@echo replacement of custom string done

"C:\Users\gkaza\AppData\Local\Microsoft\WindowsApps\PythonSoftwareFoundation.Python.3.11_qbz5n2kfra8p0\python.exe" "%scriptpath%\beyondCompareGenerateParameters.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT.java

"C:\Program Files\Beyond Compare 4\BCompare.exe" "@%1\comparison\bScripts.txt"

@echo Comparison done

setlocal EnableDelayedExpansion

echo %urlName% >> %scriptpath%\previousExecutions.txt

goto :eof
:End