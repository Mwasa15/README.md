[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/S7hTG6Vy)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11056202&assignment_repo_type=AssignmentRepo)
# Lab 1: Java Basics Assignment

## Objective
To practice the basics of Java programming including variables, data types, operations, loops, and selection statements.

## Description
In this assignment, you will write a Java program that performs various tasks using the basic concepts of Java programming. The program will consist of multiple sections that focus on different aspects of Java fundamentals. The sections are as follows:

1. Variables and Data Types
2. Arithmetic and Logical Operations
3. Loops
4. Selection Statements

## Instructions
1. Inside this project, locate a file called App.java (app/src/main/java/lab1/App.java)
2. Inside the class, you will find a main method that prints out results from four methods i.e. section1, section2,...
3. Your task is to implement the code in the appropriate methods as follows:

### Section 1: Variables and Data Types
A. Inside the section1 method, declare and initialize the following variables:
- An integer variable called "**num**" with a value of **42**
- A float variable called "**average**" with a value of **95.5**
- A character variable called "**letter**" with a value of 'A'
- A boolean variable called "**isTrue**" with a value of **true**

B. Use a `StringBuilder` to concatenate and return the values of these variables as a string.

### Section 2: Arithmetic and Logical Operations
A. Inside the section2 method, perform the following operations and store the results in separate variables:
- The sum of "**num**" and **25**
- The product of "**average**" and **2**
- The modulus of "**num**" divided by **10**
- The logical AND of "**isTrue**" and **false**

B. Use a `StringBuilder` to concatenate and return the results of these operations as a string.

### Section 3: Loops
A. Inside the section3 method, write a for loop that iterates from 1 to 10, appending the square of each number to a StringBuilder.

B. Write a while loop that iterates until "**num**" is greater than or equal to **100**. In each iteration, multiply "**num**" by 2 and append the value of "**num**" to the StringBuilder.

C. Return the concatenated string from the `StringBuilder`.

### Section 4: Selection Statements
A. Inside the section4 method, write an if-else statement to check if "**num**" is divisible by 2. If it is, append "**Even**" to a StringBuilder, otherwise append "**Odd**".

B. Write a switch statement that checks the value of "**letter**" and prints the following messages to the console based on its value:
- 'A': "Excellent"
- 'B': "Good"
- 'C': "Average"
- 'D': "Poor"
- 'F': "Fail"
- default: "Invalid grade"

C. Return the concatenated string from the `StringBuilder`.

### Submission
After completing the assignment, submit it by pushing the repository to GitHub. Make sure to include all source code and any additional files necessary to compile and run your program.