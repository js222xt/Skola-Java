package HighLow;

import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args ){
		// Init
		final Integer maxNumberOfGuesses = 10;
		Integer numberOfGuesses = 0;
		
		Random rand = new Random();
		
		Integer secretNumber = rand.nextInt(100) +1;
		
		boolean finish = false;
		
		while(!finish){
			// get input
			Scanner scan = new Scanner(System.in);
			
			// Validate so it is a number
			boolean isNumber = false;
			Integer inputNumber = -1;
			while(!isNumber){
				// Get next key
				String input = scan.next();
				
				try{
					 inputNumber = Integer.parseInt(input);
					
					if(inputNumber < 0){
						isNumber = false;
						System.out.print("< 0 try again");
					}
					else{
						isNumber = true;
					}
					
				}
				catch(Exception ex){
					isNumber = false;
					System.out.print("not integer try again");
				}
			}
			
			numberOfGuesses++;
			
			// Check
			if(inputNumber == secretNumber){
				// Win
				System.out.println("Guess " + numberOfGuesses + ": " + inputNumber );
				System.out.println("\t Correct after only " + numberOfGuesses +" guesses - Brilliant!");
				
				finish = true;
			}
			else if(inputNumber < secretNumber){
				// higher
				System.out.println("Guess " + numberOfGuesses + ": " + inputNumber );
				System.out.println("\t Hint: Higher");
			}
			else if(inputNumber > secretNumber){
				// lower
				System.out.println("Guess " + numberOfGuesses + ": " + inputNumber );
				System.out.println("\t Hint: Lower");
			}
			
			if(!finish){
				if(numberOfGuesses == maxNumberOfGuesses){
					// guesses are out
					System.out.println("No more guesses!");
					finish = true;
				}
			}
		}
	}
	
}
