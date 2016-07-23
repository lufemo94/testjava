package package1;

public class Animal {
	private String name;
	

	/**
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
