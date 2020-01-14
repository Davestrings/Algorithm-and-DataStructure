import java.util.Scanner;
public class ExamResult {
	public static void main(String[] args) {
		Scanner takeInput = new Scanner (System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while(studentCounter <= 10) {
			System.out.print("Enter student status (1 = pass and 2 = fail) ");
			int status = takeInput.nextInt();
			
			if(status == 1) {
				passes = passes + 1;
			} else {
				failures = failures + 1;
			}
			studentCounter = studentCounter + 1;
		}
		System.out.printf("%d students passed %n", passes);
		System.out.printf("%d students failed %n", failures);
		
		if(passes > 8)
			System.out.println("Bonus to instructor!");
	}

}

