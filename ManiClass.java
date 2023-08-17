package packAtm;

import java.util.Scanner;

public class ManiClass {
	public static void main(String[] args) {
		int atmNumber = 12345;
		int atmPin = 123;
		AtmOperation ao = new AtmOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To ATM Machine");
		System.out.println("Enter the Atm no");
		int atmNo = sc.nextInt();
		System.out.println("Enter the pin no");
		int pinNo = sc.nextInt();
		if(atmNumber == atmNo && atmPin == pinNo)
		{
			while(true)
			{
				System.out.println("1. View Available Balance");
				System.out.println("2. Withdraw Amount");
				System.out.println("3. Deposit Amount");
				System.out.println("4. mini Statement");
				System.out.println("5. Exit");
				System.out.println("Enter choice");
				int choice = sc.nextInt();
				switch (choice)
				{
				case 1:
					ao.viewBalance();
					break;
				case 2:
					System.out.println("Enter the Withdraw Amount ");
					Double withDrawAmount = sc.nextDouble();
					ao.withdrawAmount(withDrawAmount);
					break;
				case 3:
					System.out.println("Deposit the Amount in machine");
					Double deposit = sc.nextDouble();
					ao.depositAmount(deposit);
					break;
				case 4:
					ao.viewMiniStatement();
					break;
				case 5:
					System.out.println("Welcome To the ATM Machine");
					System.exit(0);
					break;
				}
			}
			
		}
		else
		{
			System.out.println("Incorrect Atm number");
			System.exit(0);
		} 
			
	}
}
