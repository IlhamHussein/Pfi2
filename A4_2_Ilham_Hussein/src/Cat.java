public class Cat extends Mammal {
	private int numberOfLifes;

	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		/** Eftersom Mammal extends Animal, Cat extends Mammal! */
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;

	}

	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	public void setNumberOfLifes(int numberOfLifes) {
		this.numberOfLifes = numberOfLifes;
	}

	@Override
	public String getInfo() {
		String info = "";
		info = "The Cat, " + super.getLatinName()+ ", has the gestation time " + super.getGestationTime() + " days" + " and it has " + numberOfLifes + " lifes";
		return info;
	}

}
