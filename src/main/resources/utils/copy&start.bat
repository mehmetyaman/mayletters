@echo off
Echo deleting mayletters
IF EXIST "c:\apps\apache-tomcat-5.5.17\webapps\mayletters" (
del "c:\apps\apache-tomcat-5.5.17\webapps\mayletters"
) ELSE (
echo The fodler was not found.
)
Echo copying from workspace
xcopy c:\workspace-sts-2.3.2\mayletters\target\mayletters c:\apps\apache-tomcat-5.5.17\webapps\mayletters /s
cd "C:\apps\apache-tomcat-5.5.17\bin\"
start startup.bat