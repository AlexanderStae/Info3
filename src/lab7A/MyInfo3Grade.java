package lab7A;

	import java.util.Scanner;

	public class MyInfo3Grade {

		private Scanner sc;
	
		public MyInfo3Grade() {
			sc = new Scanner(System.in);
			System.out.print("Please enter your Lab points: ");
			int labGrades = sc.nextInt();
			System.out.print("Please enter your Test points: ");
			int testGrade = sc.nextInt();
			try {
				if(labGrades >= 0 && labGrades < 71 && testGrade >= 0 && testGrade < 71) {
					double finalGrade = labGrades * 1.0 / 2;
					finalGrade += testGrade;
					System.out.println("You have " + finalGrade + " points.");
				} else throw new Exception("Please enter a nummber between 0 and 70!");
			
			} catch(Exception e){
				System.out.println(e);
			} finally {
				sc.close();
			}
		}
	}

	