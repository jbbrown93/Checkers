/*
 * Square.java
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


//start of class
public class Square {
	
	//Declare string instance variable to indicate color of square 
	private String color;
	
	//Declare boolean instance variable to indicate whether or not a square is occupied by a checker
	private boolean checker;
	
	//Create a constructor initializing instance variables
	public Square(String color, boolean checker){
		
		this.color = color;
		this.checker = checker;
	}//end Square constructor
	
	//Accessor for instance variable, color
	public String getColor(){
		return color;
	}//end method getColor
	
	//Mutator for instance variable, color
	public void setColor( String color ){
		this.color = color;
	}//end method setColor
	
	//Helper method to check if there is a checker occupied on square
	public boolean ifChecker(){
		
		//If the square has a checker (checker value is true), return true
		if ( this.checker == true ){
			return true;
		}//end of if 
		
		//Else, the square has no checker (checker value is false), return false
		else{
			return false;
		}//end else
		
	}//end method ifChecker
	
	//Accessor for instance variable, checker
	public boolean getChecker(){
		return checker;
	}//end method getChecker
	
	//Mutator for instance variable, checker
	public void setChecker( boolean checker ){
		this.checker = checker;
	}//end method setChecker
	
	@Override //Override the default toString method
	public String toString(){
		
		//If the beginning of the string color variable begins with letter B, then create a Black square
		if ( getColor().startsWith("Black") ){
			
			//If the black square has a checker, add an asterisk
			if ( ifChecker() ){
				
				return "|" + "B" + "*" + "|";
			}//end nested if
			
			//Else, the black square does not have a checker, add an empty string
			else{
				
				return "|" + "B" + " " + "|";
			}//end nested else
			
		}//end if 
		
		//Else, the beginning of the string is not a B, create a Red square
		else{
			
			//If the red square has a checker, add an asterisk
			if( ifChecker() ){
				
				return "|" + "R" + "*" + "|";	
			}//end nested if
			
			//Else, the red square does not have a checker, add an empty string
			else{
				
				return "|" + "R" + " " + "|";	
			}//end nested else
			
		}//end else
		
	}//end method toString
	
}//end class Square
