package package1;

public class Main {
	private static void printMessage(){
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		printMessage();
		Animal pig = new Animal("pig");
		Animal horse = new Animal("horse");
		System.out.println(pig);
		System.out.println(horse);
	}
	
	
}
