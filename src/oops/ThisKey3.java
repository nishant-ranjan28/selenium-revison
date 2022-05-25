package oops;

public class ThisKey3 {

	//to invoke current class constructor
	//Calling parameterized constructor from default constructor:

	ThisKey3(){
		this(5);
		System.out.println("hello hello");
	}

	ThisKey3(int x){
		System.out.println(x);
	}

	ThisKey3(String name){
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey3 b = new ThisKey3(10);
		ThisKey3 c = new ThisKey3("Nishant");
		ThisKey3 a = new ThisKey3();
	}

}
