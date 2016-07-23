package package1;

public class Main {
	private static void printMessage(){
		System.out.println("Hello world");
		System.out.println("How are you?");
		System.out.println("2 + 2 = " + sum(2, 2));
	}

	public static void main(String[] args) {
		printMessage();
		Animal pig = new Animal("pig", "didi");
		Animal horse = new Animal("horse", "pangare");
		System.out.println(pig);
		System.out.println(horse);
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
}
