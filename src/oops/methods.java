package oops;

public class methods {

	public static void main(String[] args) {
		grades("John", 91);
		grades("Tom", 50);
	}

	public static void grades(String name, int marks) {
		String grade;
		
		if(marks >= 90 && marks <=100) {
			grade = "A";
		}else if (marks >=80 && marks <90) {
			grade = "B";
		}else 
			grade = "C";
		
		System.out.println("Grade of " + name + " is: " + grade);  
	}

}
