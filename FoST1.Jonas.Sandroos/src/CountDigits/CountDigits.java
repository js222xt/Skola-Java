package CountDigits;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args ){
		
		// Scanner
		Scanner scan = new Scanner(System.in);
		
		boolean isNumber = false;
		Integer inputNumber = -1;
		String input = "";
		while(!isNumber){
			System.out.print("Provide a positive integer: ");
			
			// Get next key
			input = scan.next();
			
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
		
		Integer zeros = 0;
		Integer odds = 0;
		Integer even = 0;
		Integer sum = 0;
		
		for(Integer i = 0; i < input.length(); i++){
			Integer currentNumber = Integer.parseInt(input.substring(i, i+1));
			
			if(currentNumber == 0){
				zeros++;
			}
			else if(currentNumber % 2 == 0){
				even++;
			}
			else{
				odds++;
			}
			
			sum += currentNumber;
		}
		
		System.out.println("Zeros: " + zeros);
		System.out.println("Odd: " + odds);
		System.out.println("Even: " + even);
		System.out.println("Sum: " + sum);
	}
}
