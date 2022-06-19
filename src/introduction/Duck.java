package introduction;

public class Duck extends Bird{
	public void voice() {
		System.out.println("Quack Quack");
	}
	
	public static void main(String[] args) {
		Bird myBird = new Bird();
		Bird myDuck = new Duck();
		
		myBird.voice();
		myDuck.voice();
	}
}
