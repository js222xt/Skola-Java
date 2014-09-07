package LargestK;

import java.util.Scanner;

import Backwards.Backwards;

public class LargestK {

		// main method is called to "start" the program
		public static void main(String[] args ){
			
			// Scanner
			Scanner scan = new Scanner(System.in);

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
			
			Integer count = -1;
			Integer baseNumber = 2;
			Integer addNumber = 0;
			Integer sum = 0;
			boolean finish = false;
			
			while(!finish){	
				sum += addNumber;	
				if(sum <= inputNumber){	
					count++;
					addNumber += baseNumber;
				}
				else{
					finish = true;
				}
			}
			
			System.out.print(baseNumber * count);
		}
}
