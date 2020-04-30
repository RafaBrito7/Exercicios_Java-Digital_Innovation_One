
public class Estudante {
	
	private String name;
	private int age;
	
	public Estudante(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	public String toString() {
		return getName() + "-" + getAge();
	}

}
