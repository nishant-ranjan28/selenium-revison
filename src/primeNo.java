import java.util.Scanner;

class primeNo {

	public static boolean isPrime(int number){

	    // All negative numbers, 0 and 1 
	    // are not a prime number
	    if(number<=1) return false;

	    // check for remaining
	    for(int i=2; i<number; i++)
	        if(number%i == 0) 
	            return false;

	    return true;
	  }

	  public static void main(String[] args) {

	    // declare variables
	    int number = 0;
	    boolean flag = false;

	    // create Scanner class object
	    Scanner scan = new Scanner(System.in);

	    // read number
	    System.out.print("Enter a number:: ");
	    number = scan.nextInt();

	    // check number is prime number or not
	    flag  = isPrime(number);

	    // display result
	    if(flag) // true
	       System.out.println(number+
	                " is a prime number");
	    else 
	       System.out.println(number+
	                " is not a prime number");

	    // close Scanner class object
	    scan.close();
	  }

}
