package oops;

public class ReturnType {

	public static void main(String[] args) {
		String grade;
		String studentName;

		studentName = "Kittu";
		grade = returnGraded(90);
		displayGrade(studentName, grade);


		studentName = "Jany";
		grade = returnGraded(80);
		displayGrade(studentName, grade);
	}

	public static String returnGraded(int score) {
		String grade;

		if(score >= 90 && score <=100) {
			grade = "A";
		}else if (score >= 80 && score <90) {
			grade = "B";
		}else if(score >= 70 && score <80) {
			grade = "C";
		}else
			grade = "D";

		return grade;
	}

	public static void displayGrade(String studentName, String grade) {

		System.out.println("Grade of student " + studentName + " is: " + grade);

	}

}
