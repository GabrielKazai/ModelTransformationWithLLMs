cls
setlocal EnableDelayedExpansion
set scriptpath=%~dp0
set counter=0
set /p iter= How many iterations do you want to run (NR or ALL): 

for /d %%i in ("F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\secondIteration\*") do call :FIND %%i
goto End

:FIND
set "url=%1"

for %%a in ("%url%") do (
   set "urlPath=!url:%%~NXa=!"
   set "urlName=%%~NXa"
)
echo URL path: "%urlPath%"
echo URL name: "%urlName%"

find /c "%urlName%" previousExecutions_SecondIteration.txt >NUL
    if %errorlevel% equ 0 (
        echo found 
		goto :eof
		) else (
        echo %urlName% is not within previousExecutions_SecondIteration
		goto :Foo
		)

:Foo

if not %iter%==ALL (
	if !counter! == %iter% goto :End

	set /A counter=counter+1
)

runGPTSecondIteration.ahk %1\comparison\comparisonReportfirstExecution.txt %1\gpt\gptoutput\OutputFromGPT_SecondIteration.txt %1\gpt\gptoutput\OutputFromGPT_URL.txt 

@echo GPT execution done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\cleanGPTSecondIteration.py" %1\gpt\gptoutput\OutputFromGPT_SecondIteration.txt  %1\gpt\gptoutput\cleanGPT_SecondIteration.java 

@echo Clean GPT done

formatJava_SecondIteration.ahk %1\gpt\gptoutput\cleanGPT_SecondIteration.java 

@echo Format done

"C:\Users\Gabriel\AppData\Local\Programs\Python\Python312\python.exe" "%scriptpath%\beyondCompareGenerateParameters_SecondIteration.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT_SecondIteration.java

"F:\Gabriel\Beyond Compare 4\BCompare.exe" "@%1\comparison\secondIteration\bScripts.txt"

@echo Comparison done

setlocal EnableDelayedExpansion

echo %urlName% >> %scriptpath%\previousExecutions_SecondIteration.txt

goto :eof
:End
