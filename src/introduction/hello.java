package introduction;

public class hello {

	public static void main(String[] args) {

		System.out.println("Hello world");


		//String

		/*
		//String literals - saved in String constant pool
		String test = "test string";  // test is here reference not object


		//String object - saved in Heap
		String test2 = new String("test string 2");


		//Strings are immutable
		 test = "test string string string"; //here just reference will be changed to new string. older string won't be modified.
		 */



		//Let's use some predefined methods by java.

		String str = "Hello Kittu";

		System.out.println(str.length());
		System.out.println(str.charAt(4));

		System.out.println(str.concat(", I am nishant"));

		//contains
		System.out.println(str.contains("Kittu"));
		System.out.println(str.contains("nis"));

		//startWith
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.startsWith("Kittu"));
		
		
		String a = "I love Java";
		System.out.println(a.substring(7,11));
	}

}
