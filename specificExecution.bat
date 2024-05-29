cls

set scriptpath=%~dp0

set workpath=%scriptpath%\allXMI\works\

@echo off
set /p input= Which file do you want to execute again (name of folder): 
echo Input is: %input%

set path=%workpath%%input%

echo Working path is: %path%

"[[YOURPYTHONPATHHERE]]" "%scriptpath%combineOracle.py" %path%

@echo Combine done

runGPT.ahk %path%\gpt\xmiforgpt\Model.xmi %path%\gpt\gptoutput\OutputFromGPT.txt %path%\gpt\gptoutput\OutputFromGPT_URL.txt

@echo GPT execution done

"[[YOURPYTHONPATHHERE]]" "%scriptpath%\cleanOracle.py" %path%\oracle\combinedOracle\combined_oracle_not_cleaned.java %path%\oracle\combinedOracle\cleanOracle.java

@echo Clean Oracle done

"[[YOURPYTHONPATHHERE]]" "%scriptpath%\cleanGPT.py" %path%\gpt\gptoutput\OutputFromGPT.txt %path%\gpt\gptoutput\cleanGPT.java 

@echo Clean GPT done
@echo This is the path: %path%\oracle\combinedOracle\cleanOracle.java

formatJava.ahk %path%\oracle\combinedOracle\cleanOracle.java %path%\gpt\gptoutput\cleanGPT.java 

@echo Format done

"[[YOURPYTHONPATHHERE]]" "%scriptpath%\beyondCompareGenerateParameters.py" %path% %path%\oracle\combinedOracle\cleanOracle.java %path%\gpt\gptoutput\cleanGPT.java

"[[YOURPYTHONPATHHERE]]" "%scriptpath%\removeAddedString.py" %path%\oracle\combinedOracle\cleanOracle.java

@echo replacement of custom string done

"%scriptpath%\Beyond Compare 4.lnk" "@%path%\comparison\bScripts.txt"

@echo Comparison done

echo %input% >> %scriptpath%\previousExecutions.txt

pause

