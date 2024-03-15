cls

set scriptpath=%~dp0

for /d %%i in ("F:\Gabriel\github_desktop\ModelTransformationWithLLMs\allXMI\works\*") do call :Foo %%i
goto End

:Foo
set path=%1


@echo Combine done


@echo GPT execution done


@echo Clean Oracle


@echo Clean GPT

formatJava.ahk %1\oracle\combinedOracle\cleanOracle.java %1\xmiforgpt\cleanGPT.java 

@echo Format done

goto :eof
:End