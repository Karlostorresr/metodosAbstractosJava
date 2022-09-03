
public abstract class Dragon {
	
	public String dragonName;
	
	public Dragon(String dragonName) {
		this.dragonName = dragonName;
	}
	
	//Abstract methods
	public abstract void flightSpeed();
	public abstract void attackType();

}//Dragon

class NightFury extends Dragon{
	
	public NightFury(String dragonName){
		super(dragonName);
	}
	
	@Override
	public void flightSpeed() {
		System.out.println(dragonName + " speed is: 23km/min");
		
	}

	@Override
	public void attackType() {
		System.out.println(dragonName + " attacks with : plasmafire");
	}
	
}
class DeadlyNadder extends Dragon{

	public DeadlyNadder(String dragonName) {
		super(dragonName);
	}

	@Override
	public void flightSpeed() {
		System.out.println(dragonName + " speed is: 14km/min ");
		
	}

	@Override
	public void attackType() {
		System.out.println(dragonName + " attacks with : spines");
		
	}
	
}

class DeathGripper extends Dragon{


	public DeathGripper(String dragonName) {
		super(dragonName);
	}

	@Override
	public void flightSpeed() {
		System.out.println(dragonName + " speed is: 30km/hr");
		
	}

	@Override
	public void attackType() {
		System.out.println(dragonName + " attacks with: hammergrip ");
		
	}
	
}

class StormCutter extends Dragon{


	public StormCutter(String dragonName) {
		super(dragonName);
	}

	@Override
	public void flightSpeed() {
		System.out.println(dragonName + " speed is: 12km/min ");
		
	}

	@Override
	public void attackType() {
		System.out.println(dragonName + " attacks with: wingcut ");
		
	}
	
}

class BewilderBeast extends Dragon{


	public BewilderBeast(String dragonName) {
		super(dragonName);
	}

	@Override
	public void flightSpeed() {
		System.out.println(dragonName + " speed is: 10km /hr");
		
	}

	@Override
	public void attackType() {
		System.out.println(dragonName + " attacks with : Iceattack");
		
	}
	
}