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

"F:\Gabriel\Beyond Compare 4\BCompare.exe" "@F:\Gabriel\github desktop\ModelTransformationWithLLMs\bCompareScript.txt"
