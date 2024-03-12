cls

set scriptpath=%~dp0

for /d %%i in ("F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\*") do call :FIND %%i
goto End

:FIND
setlocal EnableDelayedExpansion
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

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%combineOracle.py" %1

@echo Combine done

runGPT.ahk %1\xmiforgpt\Model.xmi %1\xmiforgpt\OutputFromGPTAHK.txt %1\xmiforgpt\OutputFromGPTAHKURL.txt

@echo GPT execution done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanOracle.py" %1\oracle\combinedOracle\combined_oracle_not_cleaned.java %1\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanGPT.py" %1\xmiforgpt\OutputFromGPTAHK.txt %1\xmiforgpt\cleanGPT.java 

@echo Clean GPT done

formatJava.ahk %1\oracle\combinedOracle\cleanOracle.java %1\xmiforgpt\cleanGPT.java 

@echo Format done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\removeAddedString.py" %1\oracle\combinedOracle\cleanOracle.java

@echo replacement of custom string done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\beyondCompareGenerateParameters.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\xmiforgpt\cleanGPT.java

"F:\Gabriel\Beyond Compare 4\BCompare.exe" "@%1\bScripts.txt"

@echo Comparison done

setlocal EnableDelayedExpansion

echo %urlName% >> %scriptpath%\previousExecutions.txt

goto :eof
:End
