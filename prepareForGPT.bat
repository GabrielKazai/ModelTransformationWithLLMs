@echo off
cls
SET /A RAND=%RANDOM%%%9000000+1000
echo %RAND%

set scriptpath=%~dp0
if not exist "%scriptpath%\%RAND%" mkdir "%scriptpath%\%RAND%" 
if not exist "%scriptpath%\%RAND%\%RAND%_oracle" mkdir "%scriptpath%\%RAND%\%RAND%_oracle" 

ren "%scriptpath%\input_xmi.xmi" "%RAND%_input.xmi"

move "%scriptpath%\%RAND%_input.xmi" "%scriptpath%\%RAND%" 

python "%scriptpath%\combineOracle.py" %*
timeout 1 > NUL

ren "%scriptpath%\input_oracle.java" "%RAND%_oracle.java"
move "%scriptpath%\%RAND%_oracle.java" "%scriptpath%\%RAND%\\%RAND%_oracle" 

for %%f in (*.java) do (
    if "%%~xf"==".java" echo %%f & del %%f
)

git add .
git switch history
git commit -m "this is a message"
git push
