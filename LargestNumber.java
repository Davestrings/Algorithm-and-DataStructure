import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		
		int counter = 1;
		int number = 0;
		int largest = 0;
		
		while(counter <= 10) {
			System.out.print("Enter number: ");
			number = Input.nextInt();
			
			if(number > largest)
				largest = number;
			
			++counter;
		}
		
		System.out.printf("Largest number is %d%n", largest);
		
	}

}
