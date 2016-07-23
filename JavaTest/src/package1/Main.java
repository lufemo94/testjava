package package1;

import package2.Calc;

public class Main {
	private static void printMessage(){
		System.out.println("Hello world");
		System.out.println("How are you?");
	}

	public static void main(String[] args) {
		printMessage();
		Animal pig = new Animal("pig", "didi");
		Animal horse = new Animal("horse", "pangare");
		System.out.println(pig);
		System.out.println(horse);
		testCalcs();
	}
	
	private static void testCalcs(){
		System.out.println("2 + 2 = " + Calc.sum(2, 2));
		System.out.println("2^3 = " + Calc.pow(2, 3));
	}
}
