package Banking;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountClass acc = new AccountClass(1854,"Krithi Acharya",5000);
		
		int option=0;
		do
		{
			System.out.println("\n----Your Bank Menu-----");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Total Balance");
			System.out.println("4. Exit");
			try {
					option =sc.nextInt();
					switch(option) {
					case 1:
						System.out.println("Enter Deposit Amount: ");
						double deposit = sc.nextDouble();
						acc.Deposit(deposit);
						break;
					case 2:
						System.out.println("enter Amount to be withdrawn: ");
						double withdraw = sc.nextDouble();
						acc.withdraw(withdraw);
						break;
					case 3:
						acc.showBalance();
						break;
					case 4:
						System.out.println("Thank you!!....exiting....");
						break;
					default:
						System.out.println("invalid choice!");
					}
		}catch(InputMismatchException e) {
			System.out.println("Invalid input!! please enter only numbers");
			sc.nextLine();
		}
		catch(ArithmeticException e) {
			System.out.println("Error!!"+ e.getMessage());
		}
		catch(InsufficientBalanceException e){
			System.out.println("Error!!"+ e.getMessage());
		}
		}while (option!= 4);
		sc.close();
	}
}
