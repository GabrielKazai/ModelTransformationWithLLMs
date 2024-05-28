cls
setlocal EnableDelayedExpansion
set scriptpath=%~dp0
set counter=0
set /p iter= How many iterations do you want to run (NR or ALL): 

for /d %%i in ("%scriptpath%\allXMI\works\*") do call :FIND %%i
goto End

:FIND
set "url=%1"

for %%a in ("%url%") do (
   set "urlPath=!url:%%~NXa=!"
   set "urlName=%%~NXa"
)
echo URL path: "%urlPath%"
echo URL name: "%urlName%"

for /F "tokens=*" %%B in (previousExecutions.txt) do (
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

"python" "%scriptpath%combineOracle.py" %1

@echo Combine done

runGPT.ahk %1\gpt\xmiforgpt\Model.xmi %1\gpt\gptoutput\OutputFromGPT.txt %1\gpt\gptoutput\OutputFromGPT_URL.txt

@echo GPT execution done

"python" "%scriptpath%\cleanOracle.py" %1\oracle\combinedOracle\combined_oracle_not_cleaned.java %1\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle done

"python" "%scriptpath%\cleanGPT.py" %1\gpt\gptoutput\OutputFromGPT.txt  %1\gpt\gptoutput\cleanGPT.java 

@echo Clean GPT done

formatJava.ahk %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT.java 

@echo Format done

"python" "%scriptpath%\removeAddedString.py" %1\oracle\combinedOracle\cleanOracle.java

@echo replacement of custom string done

"python" "%scriptpath%\beyondCompareGenerateParameters.py" %1 %1\oracle\combinedOracle\cleanOracle.java %1\gpt\gptoutput\cleanGPT.java

"%scriptpath%\Beyond Compare 4.lnk" "@%1\comparison\bScripts.txt"

@echo Comparison done

setlocal EnableDelayedExpansion

echo %urlName%>>%scriptpath%\previousExecutions.txt

goto :eof
:End
