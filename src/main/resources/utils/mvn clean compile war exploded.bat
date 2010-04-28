@echo off
Echo mvn clean compile
cd "C:\workspace-sts-2.3.2\mayletters\"
call mvn clean compile war:exploded