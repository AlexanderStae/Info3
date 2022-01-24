package lab7B;

	import java.util.Scanner;

	public class MyInfo3Grade {

		private Scanner sc;
		private int labGrades;
		private int testGrade;
		private double finalGrade;
	
		public MyInfo3Grade() {
			sc = new Scanner(System.in);
			System.out.print("Please enter your Lab points: ");
			labGrades = sc.nextInt();
			System.out.print("Please enter your Test points: ");
			testGrade = sc.nextInt();
			finalGrade = 0;
		}
	
		public void addLab() {
			try {
				if(labGrades >= 0 && labGrades < 71) {
					finalGrade += labGrades * 1.0 / 2;
				} else throw new Exception("Please enter a nummber between 0 and 70!");
			} catch(Exception e){
				System.out.println(e);
			}
		}
	
		public void addTest() {
			try {
				if(testGrade >= 0 && testGrade < 71) {
					finalGrade += testGrade;
				} else throw new Exception("Please enter a nummber between 0 and 70!");
			} catch(Exception e){
				System.out.println(e);
			}  
		}
	
		public void printResult() {
			System.out.println("You have " + finalGrade + " points.");
		}
	}

	