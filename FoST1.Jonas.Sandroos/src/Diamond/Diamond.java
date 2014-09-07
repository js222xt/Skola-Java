package Diamond;

import java.util.Scanner;

public class Diamond {
	
	public static void main(String[] args ){
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
				
				if(inputNumber < 0 || inputNumber % 2 == 0){
					isNumber = false;
					System.out.print("< 0 try again or even");
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
		
		  int q = inputNumber/2;
	      for(int a = -q;a <= q;a++) {
	         int b = (a < 0)?-a:a;
	         int c = q-b;
	         for(int d = 0;d <= q+c;d++) {
	            System.out.print((d < b)?" ":"*");
	         }
	         System.out.println();
	      }
		/*
		for(Integer i = 0; i < inputNumber; i++){
			if(i != 0){
				if(inputNumber / 2 >= i){
					for(Integer j = 0; j < i +  (i * 2); j++){
						System.out.print("*");
					}
				}
				else{
					// bah			
				}
			}
			else{
				System.out.print("*");
			}
			
			System.out.println("");
		}*/
	}
}
