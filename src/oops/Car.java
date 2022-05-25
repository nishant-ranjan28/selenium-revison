package oops;

public class Car {

	//color
	private String color;

	//maker
	private String make;

	//model
	private String model;

	//year
	public int year;

	//behavior
	public static void increaaseSpeed() {
		System.out.println("speed increasing");
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >1900) {
			this.year = year;
		}else {
			System.out.println("This is not a valid year");
		}

	}


}
