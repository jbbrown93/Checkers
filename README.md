# Checkers
Java program that creates and prints out a checkerboard using a two dimensional Square array.

##Project Description:

Write a Java package called checkers, and write a Square class that creates
squares and checks whether the square is occupied by a checker. Then, create a Checkerboard class that
creates and prints out a checkerboard using a two dimensional Square array. Make a test class to print
out results. 

##Class Design:

###Square:
A Square object has a color that is either "Red" or "Black", that may or may not be occupied by a checker (indicated by
boolean values i.e. true if occupied or false if not occupied). 

e.g.

An unoccupied Red square on the checkerboard would look like this:
~~~
|R |
~~~
(a blank space after the color letter means there is no checker on that square)

On the otherhand, an occupied Black square on the checkerboard would look like this: 
~~~
|B*|
~~~
(an asterisk after the color letter indicates that there is a checker on that square)

###Checkerboard:
Creates a checkerboard by populating a two dimensional array of Squares.
The black squares in the first and last three rows are occupied by checkers. 

###TestChecker:
Contains a main method that tests the implementation of the Checkerboard class.

Here is a sample output of what the code produces:
~~~
|B*||R ||B*||R ||B*||R ||B*||R |
|R ||B*||R ||B*||R ||B*||R ||B*|
|B*||R ||B*||R ||B*||R ||B*||R |
|R ||B ||R ||B ||R ||B ||R ||B |
|B ||R ||B ||R ||B ||R ||B ||R |
|R ||B*||R ||B*||R ||B*||R ||B*|
|B*||R ||B*||R ||B*||R ||B*||R |
|R ||B*||R ||B*||R ||B*||R ||B*|
~~~

##Instructions on running code:

~~~
1. Move project file to Desktop
2. Open Command Prompt window
3. Enter cd <Desktop> 
4. Enter cd <Lab file name> 
5. Enter javac -cp -d <destination folder where .class files are stored> <path to the .java files>

Do not include angle brackets
~~~


To compile my package from the command line:
~~~
	Enter javac -cp. -d c:\workspace\checkers\bin checkers\*.java
~~~

To run class from command line: 
~~~
	NOTE: Run the TestChecker class like this...
	
	Enter java -cp.checkers.TestChecker
~~~
