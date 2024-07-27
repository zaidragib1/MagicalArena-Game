# MagicalArena

## Description
"Magical Arena" is a Java console game where players battle using health, strength, and attack attributes. They roll dice to attack and defend, aiming to reduce opponents' health to zero. Fast-paced and strategic, it ends when a player's health depletes.

## Getting Started
1. Download the zip file from the repository.
2. Extract the contents of the zip file to a directory on your local machine.
3. Make sure you have Java installed on your system.
4. Open a terminal or command prompt.
5. Navigate to the directory where you extracted the zip file.

## Compile and run the source code
To compile the Java files into the `bin` directory:
```bash
javac -d bin ./src/*.java
```
To run the game:
```bash
java -cp bin Main
```
## Code Coverage Report
* we are going to use jacococli.jar and jacocoagent.jar to instrument our classes and generate coverage reports
* To generate a code coverage report using JaCoCo:

1- Run the game to collect coverage data:
```bash
  java -javaagent:lib/jacocoagent.jar=destfile=coverage/jacoco.exec -cp bin Main
```

2- Generate the coverage report:
```bash
  java -jar lib/jacococli.jar report coverage/jacoco.exec --classfiles bin --sourcefiles src --html coverage/report

```

3- To check the coverage report:
* Navigate to the coverage/report directory in your project.
* Copy the absolute path from the index.html file.
* Paste the copied path into your browser's address bar.
* Press Enter to view the generated coverage report.

## JUnit 5 Test Cases
To compile and execute JUnit 5 test cases using junit-platform-console-standalone-1.10.3.jar:

1. Compile the source files:
```bash
javac -d bin src/*.java
```
2. Compile the test cases:
```bash
javac -cp "lib/junit-platform-console-standalone-1.10.3.jar;bin" -d bin test/*.java
```
3. Execute the test cases:
```bash
java -jar lib/junit-platform-console-standalone-1.10.3.jar --classpath=bin --scan-class-path
```

## How to play?
1) Run the GAME
2) The game will simulate the battle between the two players, with the player having less health attacking first.
3) The attacker's attack value, multiplied by the attacking dice roll, determines the damage inflicted, while the defender's strength value, multiplied by the defending dice roll, determines the damage defended.
4) Any excess damage from the attacker reduces the defender's health.
5) The game continues with players exchanging attacker and defender roles until one player's health reaches zero, indicating the end of the match.
6) The game announces the winner based on which player's health reaches zero first.
