----------------------------------------------------------------------------------------------------------------------------------
Info
----------------------------------------------------------------------------------------------------------------------------------
PPL-Assignment 
@author - Vaibhav Agnihotri (LIT2015007)
Build System - Java
Requirements - Java JDK, Java Run Time Environment


----------------------------------------------------------------------------------------------------------------------------------
For windows users
----------------------------------------------------------------------------------------------------------------------------------

To use javac on command prompt, add javac to your PATH environment variable. 
Right click My computer>properties>advanced>environment variables... add the bin directory in jdk to the Path variable 
Example:
Variable Name: path
Variable Value: C:\Program Files\Java\jdk1.8.0_92\bin


----------------------------------------------------------------------------------------------------------------------------------
How to Compile/Build the codes
----------------------------------------------------------------------------------------------------------------------------------

javac -d build -cp build ./src/*.java


----------------------------------------------------------------------------------------------------------------------------------
How to Run the codes
----------------------------------------------------------------------------------------------------------------------------------

java -cp build com.pplAssignment.main.Main "Followed by QuestionNumber and arguements"

Example-
--------

To run question number 1 type on terminal: java -cp build com.pplAssignment.main.Main q1




----------------------------------------------------------------------------------------------------------------------------------
Documentation
----------------------------------------------------------------------------------------------------------------------------------

Documentation was done using Javadoc on NetBeans IDE.
You can see the documentation at: dist/javadoc/index.html


----------------------------------------------------------------------------------------------------------------------------------
Test Deatils
----------------------------------------------------------------------------------------------------------------------------------

Operating System: Microsoft Windows 10 Pro
Distribution: Microsoft Windows
Version: 1607 (OS Build 14393.693)
Current Status: Running
Logging Utility: No
Random Utility: No






