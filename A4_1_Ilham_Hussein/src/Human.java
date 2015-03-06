public class Human {

	private Dog dog;
	private String name;
	private String shortName;

	public Human(String name) {
		if (name.length() > 2) {
			this.name = name;
		} else {
			this.shortName = " Human name too short!";
		}

	}

	public String getName() {
		return name;
	}

	public String getShortName() {
		return this.shortName;
	}

	/** Returnerar: "x äger en hund som heter y" eller " x äger inte en hund" */

	public String getInfo() {
		String allInfo = "";
		allInfo += getName() + " owns a dog whose name is " + dog.memberName();
		return allInfo;
	}

	public void buyDog(Dog dog) {
		this.dog = dog;
	}
}
