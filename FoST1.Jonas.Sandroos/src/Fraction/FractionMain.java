package Fraction;

public class FractionMain {

	public static void main(String[] args ){
		
		Fraction f1 = new Fraction(10, 2);
		Fraction f2 = new Fraction(20, 4);
		
		System.out.println("n = " + f1.getNumerator());
		System.out.println("d = " + f1.getDenominator());
		
		System.out.println("is negative? " + Fraction.isNegative(f1.getNumerator(), f1.getDenominator()));
		
		System.out.println("add " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f2.getNumerator() + "/" +  f2.getDenominator() + " = " + Fraction.add(f1.getNumerator(), f1.getDenominator() ,
																																										f2.getNumerator(), f2.getDenominator()));
		
		System.out.println("substract " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f2.getNumerator() + "/" +  f2.getDenominator() + " = " + Fraction.substract(f1.getNumerator(), f1.getDenominator() ,
																																													f2.getNumerator(), f2.getDenominator()));
		
		System.out.println("multiply " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f2.getNumerator() + "/" +  f2.getDenominator() + " = " + Fraction.multiply(f1.getNumerator(), f1.getDenominator() ,
																																												f2.getNumerator(), f2.getDenominator()));
		
		System.out.println("divide " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f2.getNumerator() + "/" +  f2.getDenominator() + " = " + Fraction.divide(f1.getNumerator(), f1.getDenominator() ,
																																												f2.getNumerator(), f2.getDenominator()));
		
		System.out.println("is equal? " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f2.getNumerator() + "/" +  f2.getDenominator() + " = " + Fraction.isEqualTo(f1.getNumerator(), f1.getDenominator() ,
																																												f2.getNumerator(), f2.getDenominator()));
		
		System.out.println(Fraction.toString(f1.getNumerator(), f1.getDenominator()));
		System.out.println(Fraction.toString(f2.getNumerator(), f2.getDenominator()));
		
		Fraction f3 = new Fraction(20, 0);
		
		System.out.println("is negative? " + Fraction.isNegative(f1.getNumerator(), f1.getDenominator()));
		
		System.out.println("add " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f3.getNumerator() + "/" +  f3.getDenominator() + " = " + Fraction.add(f1.getNumerator(), f1.getDenominator() ,
																																										f3.getNumerator(), f3.getDenominator()));
		
		System.out.println("substract " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f3.getNumerator() + "/" +  f3.getDenominator() + " = " + Fraction.substract(f1.getNumerator(), f1.getDenominator() ,
																																													f3.getNumerator(), f3.getDenominator()));
		
		System.out.println("multiply " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f3.getNumerator() + "/" +  f3.getDenominator() + " = " + Fraction.multiply(f1.getNumerator(), f1.getDenominator() ,
																																												f3.getNumerator(), f3.getDenominator()));
		
		System.out.println("divide " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f3.getNumerator() + "/" +  f3.getDenominator() + " = " + Fraction.divide(f1.getNumerator(), f1.getDenominator() ,
																																												f3.getNumerator(), f3.getDenominator()));
		
		System.out.println("is equal? " + f1.getNumerator() + "/" +  f1.getDenominator() + " with " +  f3.getNumerator() + "/" +  f3.getDenominator() + " = " + Fraction.isEqualTo(f1.getNumerator(), f1.getDenominator() ,
																																												f3.getNumerator(), f3.getDenominator()));
		
		System.out.println(Fraction.toString(f3.getNumerator(), f3.getDenominator()));
		
	}
	
}
