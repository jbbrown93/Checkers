/*
 * Checkerboard.java
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
public class Checkerboard {
	
	
	//Declare a two dimensional array of Squares as instance variable
	private Square[][] Squares;
	
	//Create a constructor that accepts integers of rows and columns
	public Checkerboard(int rows, int columns){
		
		//Initialize two dimensional array Squares with rows and columns
		Squares = new Square[rows][columns];
		
	
		//For each row in the length of Squares
		for (int i = 0; i < Squares.length; i++){
			
			//For each column in Square for the length of its corresponding row
			for (int j = 0; j < Squares[i].length; j++){
				
				//If the row is even,
				if( i % 2 == 0){
					
					//If it's the 4th row
					if (i == 4){
						
						//If the 4th row's columns are even, make the squares Red with no checkers
						if(j%2==0){
							Squares[i][j] = new Square("Red", false);
						}//end nested if
						
						//Else, the square is odd and the squares are Black with no checkers
						else{
							Squares[i][j] = new Square("Black", false);
						}//end nested else
					}//end the 4th row if statement
					
					//If the column is even,
					else if( j % 2 == 0){
						
						//Create squares that are red with no checkers
						Squares[i][j] = new Square("Red", false);
					}//end else if
					
					//If the column is odd,
					else{
						//Create squares that are black with checkers
						Squares[i][j] = new Square("Black", true);
					}//end else
					
				}//end if
				
				//If the row is odd,
				else{
					
					//If it's the 3rd row
					if (i == 3){
						
						//If the 3rd row column is even, make the squares Black with no checkers
						if(j%2==0){
							Squares[i][j] = new Square("Black", false);
						}//end nested if
						
						//Else, if the 3rd row column is odd, make the squares Red with no checkers
						else{
							Squares[i][j] = new Square("Red", false);
						}//end nested else
					}//end if decision
					
					//If the column is even,
					else if(j % 2 == 0){ 
						
						//Create black squares with checkers
						Squares[i][j] = new Square("Black", true);
					}//end else if
					
					//If the column is odd,
					else{
						
						//Create squares that are red with no checkers
						Squares[i][j] = new Square("Red", false);
					}//end else
				}//end else decision
				
			}//end for loop of columns
		}//end for loop of rows
		
	}//end Checkerboard constructor
	

	
	//Create private method that converts a one dimensional array to a String
	private String rowToString( Square[] row){
		
		//Create an empty to string to hold the content of each row in Squares
		String holdSquares = "";
		
		//For each Square in row, concatenate with holdSquares
		for(Square list: row){
			
			//Call the Square class toString method, to convert each row of Squares into a String
			holdSquares = list.toString() + holdSquares;
			
		}//end for each loop
		
		return holdSquares;
	}//end method rowToString
	
	@Override //Override default toString method
	public String toString(){
		
		//Create an empty string to hold the content of each row in Squares
		String holdSquares = "";
		
		//For the entire length of the Square, convert each row into a string and concatenate with 
		//holdSquares
		for (int i = 0; i < Squares.length; i++){
			
		
			holdSquares = holdSquares + rowToString(Squares[i]) + "\n";
			
		}//end for loop
		
		return holdSquares;
			
	}//end of method toString

}//end of class Checkerboard
