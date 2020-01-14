import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner takeInput = new Scanner(System.in);
			
			int total = 0;
			int gradeCounter = 1;
			
			while(gradeCounter <= 10) {
				System.out.print("Enter grade ");
				int grade = takeInput.nextInt();
				total = total + grade;
				gradeCounter = gradeCounter + 1;
			}
			
			int average = total / 10;
			
			System.out.printf("%n Total of all 10 grades is %d%n", total);
			
			System.out.printf("Class Average is %d%n", average);
	}

}
