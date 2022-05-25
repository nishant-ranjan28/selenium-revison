package oops;

public class ThisKey4 {
	
	void m(ThisKey4 obj) {
		System.out.println("method invoked");
	}
	
	void n() {
		m(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey4 s1 = new ThisKey4();
		s1.n();
		
		/*
		 In event handling (or) in a situation where we have to provide reference of a class to another one. 
		 It is used to reuse one object in many methods.
		 */
	}

}
