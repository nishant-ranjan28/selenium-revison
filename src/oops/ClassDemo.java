package oops;

public class ClassDemo {
	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println("Make of BMW is: "+ bmw.getMake());
		
		System.out.println("Model of BMW is: " + bmw.getModel());
		
		Car benz = new Car();
		benz.setMake("BENZ");
		System.out.println("Make of Benz is: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of Benz is: " + benz.getModel());
		
		benz.setYear(2022);
		System.out.println("Year of BENZ is: " + benz.getYear());
	}

}
