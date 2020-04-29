public class Pessoa implements Comparable<Pessoa> {

	private String name;
	private double height;
	private int age;

	public Pessoa(String name, double height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return getName() + " - " + getHeight() + " m. - " + getAge() ;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.age - o.age;
	}


}
