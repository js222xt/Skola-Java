package Fraction;

public class Fraction {

	int n;
	int d;
	
	public Fraction(int n, int d){
		if(d  != 0){
			this.n = n;
			this.d = d;
		}
		else{
			this.n = 0;
			this.d = 0;
			printZeroError();
		}
	}
	
	public int getNumerator(){
		return n;
	}
	
	public int getDenominator(){
		return d;
	}
	
	public static boolean isNegative(int n, int d){
		if(d == 0){
			printZeroError();
			return false;
		}
		else{
			if(n/d < 0){
				return true;
			}
			else{
				return false;
			}
		}		
	}
	
	public static double add(int n1, int d1, int n2, int d2){
		if(d1 == 0 || d2 == 0){
			printZeroError();
			return 0.0;
		}
		else{
			return (n1/d1) + (n2/d2);
		}		
	}
	
	public static double substract(int n1, int d1, int n2, int d2){
		if(d1 == 0 || d2 == 0){
			printZeroError();
			return 0.0;
		}
		else{
			
		}
		return (n1/d1) - (n2/d2);
	}
	
	public static double multiply(int n1, int d1, int n2, int d2){
		if(d1 == 0 || d2 == 0){
			printZeroError();
			return 0.0;
		}
		else{
			
		}
		return (n1/d1) * (n2/d2);
	}
	
	public static double divide(int n1, int d1, int n2, int d2){
		if(d1 == 0 || d2 == 0){
			printZeroError();
			return 0.0;
		}
		else{
			
		}
		return (n1/d1) / (n2/d2);
	}
	
	private static void printZeroError(){
		System.out.print("the denominator cannot be 0!! ");
	}
	
	public static boolean isEqualTo(int n1, int d1, int n2, int d2){
		if(d1 == 0 || d2 == 0){
			printZeroError();
			return false;
		}
		else{
			if(n1/d1 == n2/d2){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public static String toString(int n, int d){
		if(d == 0){
			printZeroError();
			return "";
		}
		else{
			return n + "/" + d + " = " + (n/d);
		}
	}
	
}
