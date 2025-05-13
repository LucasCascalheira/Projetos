@echo off
setlocal
set JAVA_HOME=%JAVA_HOME%
if not defined JAVA_HOME (
    for /f "delims=" %%i in ('java -XshowSettings:properties -version 2^>^&1 ^| findstr "java.home"') do (
        set JAVA_HOME=%%i
    )
)
call "%~dp0\gradle\wrapper\gradle-wrapper.bat" %*