@echo off
title Vælg en opgave
cls
echo ==============================
echo  Vælg opgave ved at skrive et tal mellem 1-5
echo ==============================
set /p taskNum=Indtast tal: 
if "%taskNum%"=="1" (
    cd Task1
    javac Main.java
    java Main
    pause
    exit
)
if "%taskNum%"=="2" (
    cd Task2
    javac Main.java
    java Main
    pause
    exit
)
if "%taskNum%"=="3" (
    cd Task3
    javac Main.java
    java Main
    pause
    exit
)
if "%taskNum%"=="4" (
    cd Task4
    javac Main.java
    java Main
    pause
    exit
)
if "%taskNum%"=="5" (
    cd Task5
    javac Main.java
    java Main
    pause
    exit
)

echo Ugyldigt valg! Prøv igen.
pause
exit

