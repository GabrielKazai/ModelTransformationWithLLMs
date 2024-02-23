@echo off
cls
set scriptpath=%~dp0
python "%scriptpath%\combineOracle.py" %*

timeout 1 > NUL

runGPT.ahk

timeout /t 2

python "%scriptpath%\cleanOracle.py" %*
python "%scriptpath%\cleanGPT.py" %*

timeout /t 2

formatJava.ahk

timeout /t 2

fc cleanOracle.java cleanGPT.java > fc_export.txt