import java.util.Scanner;
public class CreditCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner takeInput = new Scanner(System.in);
		
		int newBalance = 0;
		int creditCounter = 0;
		int creditCounter2 = 0;
		
		
		System.out.print("Enter your Account Number or -1 to quit: ");
		int acctNumber = takeInput.nextInt();
		
		System.out.print("Enter your starting balance for this month or -1 to quit: ");
		int balance = takeInput.nextInt();
		
		System.out.print("Enter total price of items charged for the month: ");
		int itemCharged = takeInput.nextInt();
		
		System.out.print("Enter the total credit applied to your account: ");
		int creditApplied = takeInput.nextInt();
		
		System.out.print("Enter your credit limit: ");
		int creditLimit = takeInput.nextInt();
		
		while(balance != -1) {
			newBalance = (balance + itemCharged) - creditLimit;
			System.out.printf("Your new balance is %d%n", newBalance);
			if(newBalance > creditLimit) {
				System.out.println("Credit limit exceeded");
				++creditCounter;
			}else {
				System.out.printf("your remaining credit allowed is: %d%n", creditLimit - newBalance);
				++creditCounter2;
			}
			
			System.out.print("Enter your Account Number or -1 to quit: ");
			acctNumber = takeInput.nextInt();
			
			System.out.print("Enter your starting balance for this month or -1 to quit: ");
			balance = takeInput.nextInt();
			
			System.out.print("Enter total price of items charged for the month: ");
			itemCharged = takeInput.nextInt();
			
			System.out.print("Enter the total credit applied to your account: ");
			creditApplied = takeInput.nextInt();
			
			System.out.print("Enter your credit limit: ");
			creditLimit = takeInput.nextInt();
			
		}
	}

}
