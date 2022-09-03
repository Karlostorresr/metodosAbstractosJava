
public class DragonTest {
	public static void main( String args[]) {
	
		System.out.println("Dragon");	
	
		Dragon dragon = new NightFury("NightFury");
		dragon.attackType();
		dragon.flightSpeed();
		
		dragon = new DeadlyNadder("DeadlyNadder");
		dragon.attackType();
		dragon.flightSpeed();
		
		dragon = new DeathGripper("DeathGripper");
		dragon.attackType();
		dragon.flightSpeed();
		
		dragon = new StormCutter("StormCutter");
		dragon.attackType();
		dragon.flightSpeed();
		
		dragon = new BewilderBeast("BewilderBeast");
		dragon.attackType();
		dragon.flightSpeed();
		
		
	}
}
