/*
 * TestChecker.java
 * 
 * Version 7
 * 
 * Copyright Jordan Brown
 * 
 * Course: CSC 171 SPRING 2015
 * 
 * Last Revised: March 30th, 2015
 */

package checkers;
import checkers.Checkerboard;

//start of test class Test Checker
public class TestChecker {

	//main method begins execution of Java application
	public static void main(String[] args) {
		
		//Create an instance of Checkerboard, and print out a checkerboard
		Checkerboard checkerboard = new Checkerboard(8,8);
		System.out.println(checkerboard);
		
	}//end of main method

}//end of class TestChecker