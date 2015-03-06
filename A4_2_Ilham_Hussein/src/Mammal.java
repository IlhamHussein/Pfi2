public abstract class Mammal extends Animal {
	private int gestationTime;

	public Mammal(String latinName, int gestationTime) {
		/**
		 * Superklassens konstruktor anropas först i subklassenkonstruktor
		 * med: super(eventuella parametrar);
		 */
		super(latinName);
		this.gestationTime = gestationTime;

	}

	public int getGestationTime() {
		return gestationTime;
	}

}
