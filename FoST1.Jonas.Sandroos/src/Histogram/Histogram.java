package Histogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Histogram {

	public static void main(String[] args ){
		
		
		try{
			
			String path = args[0];
			
			// Read integers from file
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			int value;
			List<Integer> intList = new ArrayList<Integer>();
			String currentNumber = "";
			while ((value = br.read()) != -1) {
				char c = (char)value;
				
				if(Character.isDigit(c)){
					// Number
					currentNumber += c;
				}
				else{
					if(currentNumber != ""){
						if(Integer.parseInt(currentNumber) > 200){
							throw new Exception("File contains numbers over 200");
						}
						intList.add(Integer.parseInt(currentNumber));
						currentNumber = "";
					}					
				}
			}
			// If the last character in the file is a number, it will not be added so this is a fix.
			if(currentNumber != ""){
				intList.add(Integer.parseInt(currentNumber));
			}
			
			// We now have a list of integers, check what category
			int[] category = {0,0,0,0,0,0,0,0,0,0,0};
			
			/*
			int oneToTen = 0;
			int elevenToTw = 0;
			int twoOeToThi = 0;
			int thiOneToForth = 0;
			int forthOneToFifth = 0;
			int firthOneToSix = 0;
			int sixOneToSeveth = 0;
			int sevethOneToEigth = 0;
			int eigthOneToNinth = 0;
			int ninthOneToHund = 0;
			int hundOneToTwoHund = 0; */
			
			for(int i = 0; i < intList.size(); i++){
				Integer num = intList.get(i);

				if(num > 0 && num < 10){
					category[0] = category[0] + 1; 
					//oneToTen++;
				}
				else if(num > 10 && num < 21){
					category[1] = category[1] + 1; 
					//elevenToTw++;
				}
				else if(num > 20 && num < 31){
					category[2] = category[2] + 1;  
					//twoOeToThi++;
				}
				else if(num > 30 && num < 41){
					category[3] = category[3] + 1; 
					//thiOneToForth++;			
				}
				else if(num > 40 && num < 51){
					category[4] = category[4] + 1; 
					//forthOneToFifth++;
				}
				else if(num > 50 && num < 61){
					category[5] = category[5] + 1; 
					//firthOneToSix++;
				}
				else if(num > 60 && num < 71){
					category[6] = category[6] + 1; 
					//sixOneToSeveth++;
				}
				else if(num > 70 && num < 81){
					category[7] = category[7] + 1; 
					//sevethOneToEigth++;
				}
				else if(num > 80 && num < 91){
					category[8] = category[8] + 1; 
					//eigthOneToNinth++;				
				}
				else if(num > 90 && num < 101){
					category[9] = category[9] + 1; 
					//ninthOneToHund++;
				}
				else if(num > 100 && num < 201){
					category[10] = category[10] + 1; 
					//hundOneToTwoHund++;
				}
				
			}			
			
			// Print
			int sum = 0;
			for(int i = 0; i < 9; i++){
				
				sum += category[i];
			}
			
			System.out.println("Reading integers from the file: " + path);
			System.out.println("Number of integers in the interval [1,100]: " + sum);
			System.out.println("in the interval [101,200]: " + category[10]);
			System.out.println("Histogram");
			for(int i = 0; i < category.length; i++){
				
				if(i == 0){
					System.out.print("1    - 10  | ");
				}
				else if(i == 1){
					System.out.print("11   - 20  | ");
				}
				else if(i == 2){
					System.out.print("21   - 30  | ");			
				}
				else if(i == 3){
					System.out.print("31   - 40  | ");
				}
				else if(i == 4){
					System.out.print("41   - 50  | ");
				}
				else if(i == 5){
					System.out.print("51   - 60  | ");
				}
				else if(i == 6){
					System.out.print("61   - 70  | ");
				}
				else if(i == 7){
					System.out.print("71   - 80  | ");
				}
				else if(i == 8){
					System.out.print("81   - 90  | ");
				}
				else if(i == 9){
					System.out.print("91  - 100  | ");
				}
				else if(i == 10){
					System.out.print("101 - 200  | ");
				}
				
				for(int j = 0; j < category[i]; j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
