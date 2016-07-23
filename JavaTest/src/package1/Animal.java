package package1;

public class Animal {
	private String name;
	private String nickname;

	/**
	 * @param name
	 */
	public Animal(String name, String nickname) {
		this.name = name;
		this.nickname = nickname;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	
	
}
