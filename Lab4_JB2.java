/*
 * Jamari Bell 
 * 10/10/2022
 * Lab 4, generate a random number and create a way for the user to input values 
 * with 10 chances to guess the random number correctly. If the user wins, print 
 * congrats statement with the amount of guesses it took. If the user loses, print 
 * statement that tells them what the correct number was. 
 */

import java.util.Scanner;
import java.util.Random;

public class Lab4_JB2 {
	
	public static void main(String[] args) {
		
		// create scanner to receive input from user
		Scanner kbd = new Scanner(System.in);	
		
						
		//System.out.print("Enter your guess at my number ");
		
		// receive input values from user 
		int userInput = kbd.nextInt(); 
		
		// create random number generator 
		Random generator = new Random(); 
		int rNumber = generator.nextInt(100)+1;
				
		// initialize counter 
		int counter = 0;
		
		
		while (userInput != rNumber && counter < 10 )
		{
			//prompt the user
			System.out.print("Enter your guess at my number ");
			userInput = kbd.nextInt(); 
			
			counter++; 
			
			if (userInput < rNumber) //works 
			{
				System.out.println("Sorry, your guess is too small");
			}
			
			else if (userInput > rNumber) //works 
			{
				System.out.println("Sorry, your guess is too large");
			}
			
			if (userInput == rNumber) //is correct
			{
				System.out.println("You got it, in " + counter + " guesses!"); 
				
			}
			
			else if (counter == 10) //this is correct
			 {
				if (userInput != rNumber)
				{
					System.out.println("You're out of guesses. My Number: " + rNumber);
				}
			
			 }
		

		}
			
		//close scanner 
		kbd.close();

	}
}
