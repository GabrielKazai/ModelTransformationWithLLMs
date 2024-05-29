cls
setlocal EnableDelayedExpansion
set scriptpath=%~dp0
set counter=0
set /p iter= How many iterations do you want to run (NR or ALL): 

for /d %%i in ("%scriptpath%\allXMI\works\secondIteration\*") do call :FIND %%i
goto End

:FIND
set "url=%1"

for %%a in ("%url%") do (
   set "urlPath=!url:%%~NXa=!"
   set "urlName=%%~NXa"
)
echo URL path: "%urlPath%"
echo URL name: "%urlName%"

for /F "tokens=*" %%B in (previousExecutions_SecondIteration.txt) do (
	set "LineValue=%%B"
	echo %%B was found

	if "!LineValue!"=="%urlName%" (
		echo found a match
		echo !LineValue! is linevalue when match is found
		goto :End
	)
	echo !LineValue! is linevalue when match is not found
)

echo %urlName% is not within previousExecutions 
goto :Foo

:Foo

if not %iter%==ALL (
	if !counter! == %iter% goto :End

	set /A counter=counter+1
)

runGPTSecondIteration.ahk %1\comparison\comparisonReportfirstExecution.txt %1\gpt\gptoutput\OutputFromGPT_SecondIteration.txt %1\gpt\gptoutput\OutputFromGPT_URL.txt 

@echo GPT execution done

"python" "%scriptpath%\cleanGPTSecondIteration.py" %1\gpt\gptoutput\OutputFromGPT_SecondIteration.txt  %1\gpt\gptoutput\cleanGPT_SecondIteration.java 

@echo Clean GPT done

formatJava_SecondIteration.ahk %1\gpt\gptoutput\cleanGPT_SecondIteration.java 

@echo Format done

"python" "%scriptpath%\beyondCompareGenerateParameters_SecondIteration.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT_SecondIteration.java

"%scriptpath%\Beyond Compare 4.lnk" "@%1\comparison\secondIteration\bScripts.txt"

@echo Comparison done

setlocal EnableDelayedExpansion

echo %urlName%>>%scriptpath%\previousExecutions_SecondIteration.txt

goto :eof
:End
