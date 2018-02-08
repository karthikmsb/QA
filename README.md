# ECS

ECS Test

Technology Stack:

Note: Designed and Exceuted in Windows

Test Design - Cucumber

Test Exceution -  Selenium Web Driver, Java

Test Framework - Junit

Project Configuration - Maven/POM

Framework Structure:

Features - Step Definitions - Step Implementations (Pom- Page Object Model.)

Test Data Management (Cucumber).

Directories:

Test Scenarios - src/test/Feature

Step Definitions - src/test/java/stepDef

Step Implementations - src/main/java/stepimplementaions

Pre-requisite to create Automation Framework:


Maven installed locally

Intellij IDEA - IDE

Dependencies - Selenium, Junit, Cucumber, Maven surefire

Test Data - property file.

Test Sets:

Contactus.feature


Execution Steps:

Import project to intellij idea and navigate to test directory and exceute the run file (Ecs/src/test/java/run) or locate the pom.xml directory using command prompt and use the command mvn test for execution.
Provide the appropriate tag name in the run file to execute appropriate test sets.
Tests are categorized with Featue{.} and tags {}. Click Run to execute the file.
