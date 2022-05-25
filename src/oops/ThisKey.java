package oops;

public class ThisKey {

	int roll;
	String name;
	double fee;

	// What problem we face if we don't use this keyword.
	//	ThisKey(int roll, String name, double fee){
	//		roll = roll;
	//		name = name;
	//		fee = fee;
	//	}


	//This key is not required if parameters and instance variables are not same.
	//	ThisKey(int r, String n, double f){
	//		roll = r;
	//		name = n;
	//		fee = f;
	//	}

	//this key is required if parameters and instance variables are same.

	ThisKey(int roll, String name, double fee){
		this.roll = roll;
		this.name = name;
		this.fee = fee;
	}

	public void display() {
		System.out.println(roll + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKey s1 = new ThisKey(1, "Tom", 100.9);
		s1.display();
	}

}
