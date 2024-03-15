set scriptpath=%~dp0

@echo off
echo This is a test >> %scriptpath%\previousExecutions.txt
echo 123>> %scriptpath%\previousExecutions.txt
echo 245.67>> %scriptpath%\previousExecutions.txt


setlocal EnableDelayedExpansion

set "url=F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\example3"

for %%a in ("%url%") do (
   set "urlPath=!url:%%~NXa=!"
   set "urlName=%%~NXa"
)
echo URL path: "%urlPath%"
echo URL name: "%urlName%"

find /c "example7" previousExecutions.txt >NUL
    if %errorlevel% equ 0 (
        echo found 
		) else (
        echo not found
		)
pause



