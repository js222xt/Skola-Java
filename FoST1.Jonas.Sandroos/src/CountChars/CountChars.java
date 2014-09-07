package CountChars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountChars {

	public static void main(String[] args) {
		 
		try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
		{ 
			Integer lower = 0;
			Integer upper = 0;
			Integer whiteSpace = 0;
			Integer number = 0;
			Integer other = 0;
			
			int value;
			while ((value = br.read()) != -1) {
				char c = (char)value;
				if(Character.isLowerCase(c)){
					// lower
					lower++;
				}
				else if(Character.isWhitespace(c)){
					// Whitespace
					whiteSpace++;
				}
				else if(Character.isUpperCase(c)){
					// Upper
					upper++;
				}
				else if(Character.isDigit(c)){
					// Number
					number++;
				}
				else{
					// Something else
					other++;
				}
			}
			
			System.out.println("Uppercase: " + upper);
			System.out.println("Lowercase: " + lower);
			System.out.println("Whitespace: " + whiteSpace);
			System.out.println("Number: " + number);
			System.out.println("Other: " + other);
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}	
}
