@echo off
SETLOCAL


SET mypath=%~dp0
SET PATH=%mypath%\lib;%PATH%

if "%1"=="" goto help
if "%1"=="mms" goto mms

java -Djava.library.path=%mypath%\lib\ -classpath "%mypath%\lib\*;%mypath%\lib\elasticsearch-1.5.0\*;%mypath%\lib\scalalib\*" k.frontend.Main -f %1 %2 %3 %4 %5
goto exit

:mms
java -Djava.library.path=%mypath%\lib\ -classpath "%mypath%\lib\*;%mypath%\lib\elasticsearch-1.5.0\*;%mypath%\lib\scalalib\*" k.frontend.Main -mmsJson mms.json
goto exit

:help
echo.
echo Please provide a file to run on.
echo.

:exit


