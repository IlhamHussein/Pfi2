/** Abstract classes cannot be instantiated, but they can be subclassed. */
public abstract class Animal {
	private String latinName;
	private String friendlyName;

	public Animal(String latinName) {
		this.setLatinName(latinName);
	System.out.println(latinName);
	}

	/**
	 * An abstract method is a method that is declared without an implementation
	 * without braces, and followed by a semicolon
	 * 
	 * If a class includes abstract methods, then the class itself must be
	 * declared abstract, as in:
	 */
	public abstract String getInfo();
	

	public void setFriendlyName(String friendlyName) {
this.friendlyName= friendlyName;	
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
}
