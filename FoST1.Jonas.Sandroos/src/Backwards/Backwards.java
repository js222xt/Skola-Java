package Backwards;

import java.util.Scanner;

public class Backwards {

	// main method is called to "start" the program
	public static void main(String[] args ){
		// Create obj
		Backwards bw = new Backwards();
		
		// Output
		System.out.print("Type a line of text: ");
		
		// Get user input
		String input = bw.getUserString();
		
		// Reverse user input
		String reverse = bw.reverseString(input);
		
		// Print
		System.out.print(reverse);
	}
	
	private String getUserString(){
		// Create scanner
		Scanner scan = new Scanner(System.in);
		// Get user input
		String input = scan.nextLine();
		// Close
		scan.close();
		
		return input;
	} 
	
	private String reverseString(String s){
		// Reverse
		return new StringBuffer(s).reverse().toString();
	}
}