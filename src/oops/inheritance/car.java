package oops.inheritance;

public class car {
	
	int speed;
	
	public car(int startSpeed) {
		speed = startSpeed;
	}
	public void increaseSpeed() {
		speed++;
		System.out.println("increasing speed");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing speed");
	}

}
