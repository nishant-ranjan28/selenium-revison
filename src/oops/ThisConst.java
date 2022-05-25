package oops;

public class ThisConst {

	int roll;
	String name, course;
	float fee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisConst s1 = new ThisConst(11, "Nishant", "Btech");
		ThisConst s2 = new ThisConst(2, "Kittu", "MBA", 112f);
		
		s1.display();
		s2.display();

	}

	ThisConst(int roll, String name, String course){

		this.roll = roll;
		this.name = name;
		this.course = course;
	}

	ThisConst(int roll, String name, String course, float fee){
		
		//Rule: Call to this() must be the first statement in constructor.

		this(roll, name, course); //reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(roll + " " + name + " " + course + " " + fee);
	}


}
