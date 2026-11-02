@echo off
echo Starting Spring Boot application...

java -jar "%~dp0target\jenkinsTest-0.0.1-SNAPSHOT.jar"

echo Application stopped or failed.
pause