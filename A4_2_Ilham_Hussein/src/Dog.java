public class Dog extends Mammal {
	private boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
	this.stupid = stupid; }
	
	public Dog(String latinName, int gestationTime, boolean stupid,
			String friendlyName) {
		super(latinName, gestationTime);
		super.setFriendlyName(friendlyName); // F
		this.stupid = stupid;
	}


	public boolean isStupid() {
		return stupid;
	
	}

	@Override
	public String getInfo() {
		String stupidDog = " is a stupid";
		String notStupidDog = " is not a stupid";
		
		String info = "The Dog " + super.getFriendlyName()+ " , " + super.getLatinName() +", has the gestation time " + super.getGestationTime() + " days and";
	
		if(isStupid() == true){
			return info + stupidDog;
		}
		else{
		return info + notStupidDog;
		}
		
	}
}
// om den är true == stupid om den är false == not stupid 
