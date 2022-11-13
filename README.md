# Java-Programming

This repository contains all the codes I've used for my java lab assignments, as well as solutions to CAT1 and CAT2 exam.  

**Course Code:** CSE1007  
**Fall Semester'22**

## I. Basic Programming
*** 

**1. Read the radius and print the area of a circle**  
[solution](basic_programs/Radius.java)

**2. Read the number and check whether it is divisible by 3 and 5**  
[solution](basic_programs/Divisible.java)

**3. Display Subject Name based on room number. If the user enters 604 then display Java Programming. If the user enters 605 then display Python programming for any other input display Invalid input to the user**  
[solution](basic_programs/Room.java)

**4. Print the sum of the series 1 +2 +3 up to n terms**  
[solution](basic_programs/Sum.java)

**5. Print the multiplication table by getting the n from the user.**  
[solution](basic_programs/Multiplication.java)


**6. Provide the option of adding two numbers to the user until the user wants to exit.**

__7. Print this pattern for n lines
(a)__  
__*__   
__**__   
__***__  
__****__  

__(b)  
1234  
123  
12  
1__ 

__(c)  
1  
12  
123  
1234  
1234  
123  
12  
1__


## II. Arrays
***

__1. Write a java program to read a student 5 subject marks and print the third highest and lowest mark.__  

__2. Write a program to find 2 elements in the array such that the difference between them is smallest in the 3x3 matrix__  

__3. Write a program to demonstrate the following__  
> There are 4 teams in IPL , read the count of the batsman ( who scored <50 runs)in each Team. Coach should be assigned in the ratio of 1:4 (For every 4 less scorer batsman, there should be one coach). Determine the number of coach for each team. Create a 2-D jagged array with 4 rows to store the count of less scorer batsman in 4 teams. The number of columns in each row should be equal to the number of groups formed for that particular team( Eg: If there are 17 less scorer batsman in a team, then there should be 4 coach and in the jagged array, the corresponding row should store 4, 4, 4, 4, 1). Use for-each loop to traverse the array and print the details. Also print the number of teams in which all coaches have exactly 4 batsman.

## III. Classes and Objects
***
__1. Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.__  
> - A default constructor that creates a default rectangle.
> - A constructor that creates a rectangle with the specified width and height.
> - A method named getArea() that returns the area of this rectangle.
> - A method named getPerimeter() that returns the perimeter.

__Implement the class. Write a test program that creates two Rectangle objects— one with width 5 and height 50 and the other with width 2.5 and height 45.7. Display the width, height, area, and perimeter of each rectangle in this order.__  

__2. Write a Java program to create a class called Student having data members Regno, Name, Course being studied and current CGPA. Include constructor to initialize objects. Create array of objects with 6 students and find 9-pointers.__  
 
## IV. Method Overloading 
***

__1. Write a Java program that displays area of different Figures (Rectangle, Square, Triangle) using the method overloading.__  

__2. In a school, students of all classes from std I to X appear for the MathPremierLeague examination. Define a class MPL which stores the details of the marks scored by each class:__  
> **- It should contain the following 4 data members: Standard, number of students, marks[] array to store the scores of all the students of the class in MPL exam.**  
**- Define a parameterized constructor which receives the values for the first two data members from the main() method.**  
**- Create a Form within the constructor, read the marks of all students and hence find the first mark.**  
**- Define a method findBestClass() to display the standard which has secured the highest mark.**  
**- Overload this method to display the standard with the highest class average. The marks array should be declared dynamically based on the strength of the class.**  

## V. Abstract Classes and Interfaces
***
**1. Write an abstract class special with an abstract method double Process (double P,double R). Create a subclass Discount and implement the Process() method with the following formula: net=P- P*R/100. Return the Process() method with the following formula: total=P+P*R/100. Return the total.**  

**2. Write an interface called Numbers, with a method int Process(int x,int y). Write a class called Sum, in with the method Process finds the sum of two numbers and returns an int value. Write another class called Average, in which the process method finds the average of the two numbers and returns an int.**  

**3. Write an interface called Exam with a method Pass ( ) that returns the total marks. Write another interface called Classify with a method Average (int total) which returns a string. Write a Class called Result which implements both Exam and Classify. The Pass method should get the marks from the user and finds the total marks and return. The Division method calculate the average marks and return “First” if the average is 60 or more, “SECOND” when average is 50 or more but below 60, “NO DIVISION” when average is less than 50.** 

## VI. Packages
***
**1. Create an interface with methods add () and sub () in a package called ‘pack1’. Create another package ‘pack2’ with an interface with methods multiply () and divide (). Write a main class to perform arithmetic operations on integer numbers by implementing both the interfaces.**  

**2. Write a program to demonstrate the knowledge of students in working with user- defined packages and sub-packages. Eg., Within the package named ‘primespackage’, define a class Primes which includes a method checkForPrime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in the Primes class.**  

## VII. Exception Handling
***
**1. Read the Register Number and Mobile Number of a student. If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’**  

**2. A bag contains balls of 4 different colors- red, green, blue and yellow. Simulate picking up a ball at random for ten times. If the same colored ball is picked more than thrice, throw SameColorBallException and proceed with the simulation once again. After 10 valid picks, print the number of balls chosen from each of these colors.**

## VIII. Multithreading, File Handling
***

**1. Write a program to demonstrate the knowledge of students in multithreading.**
> Three students A, B and C of B.Tech- II year contest for the PR election. With the total strength of 240 students in II year, simulate the vote casting by generating 240 random numbers (1 for student A, 2 for B and 3 for C) and store them in an array.  
> Create four threads to equally share the task of counting the number of votes cast for all the three candidates.  
> Use synchronized method or synchronized block to update the three count variables.  
> The main thread should receive the final vote count for all three contestants and hence decide the PR based on the values received.

**2.Write a program that takes a file name and a search string from the user. If the search string occurs in the file, then it counts the number of occurrences of the string (Assume that search pattern can exist more than two times in a line).**  

**3. Write a program to demonstrate the knowledge of students in File handling.**  
> Define a class ‘Donor’ to store the below mentioned details of a blood donor. Name, age, Address, Contact number, blood group, date of last donation.  
> Create ‘n’ objects of this class for all the regular donors at Vellore.  
> Write these objects to a file.  
> Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.  

## IX. Serialization, Deserialization, Collections
***

**1.Write a Java program to store the objects of the class Employee (Emp_id, Name, Designation and salary) in a file in sequential order. De-serialize the same file to display the details of the employees whose salary is lesser than 50000.**  

**2. Online bank loan sanction facility is launched to facilitate the customer.**
> Write a java program to create class Loan with data members customer name, address, age, salary, loan amount, loan type(housing, vehicle, personal).  
> Take the necessary inputs and help the customer to write the object into the file when they submit the application.  
> Once the application is submitted bank manager will fetch the loan details from the file and verify the details for approval.

**3.Write a Java program to read student id, name and marks of three subjects and add student to list and print the student details using ArrayList and Iterator.** 

## X. Strings
***

**1. A hash algorithm uses rotation and fold shift methods to compute the address at which the user input has to be stored.**
> Define a static method to perform rotation of the data by moving the least significant digit to the most significant bit position.  
> Also define a non-static method to perform fold shift by dividing the rotated data into segments of length 2 and then add all the segments to get the hash address.  
> If the sum has more than 2 digits, delete the most significant digit and the resulting number is the address. Invoke these methods from main( ) method.  
> eg. If the data is 112286, after rotation it should be 611228 and after fold shift it should be 61 + 12 + 28=101 =01 (after deleting the most significant digit)

**2. Consider a Java program containing a statement to invoke format( ) method for displaying the output. Write a program to verify the syntax correctness of the statement by checking for the following.**  
**- The number of format specifiers and arguments should match.**  
**- Datatype of the arguments should match the format specifiers used.**
> For example, if the input is similar to any of the three statements given below, the output should be “correct syntax” for the first two statements and it should be “wrong syntax” for the last statement.  
i) System.out.format("sum is %d"+" avg is %f ", a,b);  
ii) System.out.format(" name is %s"+"sum is %d avg is %f ", s,a,b);  
iii) System.out.format("sum is %d"+" avg is %f ", b,a);  

> Assume you have a 2D String array storing all the variables used in the program and their datatypes as follows.  
a   | B     | s      | x   
int | Float | String | int