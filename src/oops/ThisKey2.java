package oops;

public class ThisKey2 {

	//This: to invoke current class method

	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		m();
	}

	void o() {
		n();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKey2 thiskey2 = new ThisKey2();
		thiskey2.o();
	}

}
