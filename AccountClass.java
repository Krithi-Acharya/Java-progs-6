package Banking;

public class AccountClass {
	private int AccountNum;
	private String AccountName;
	private double AccBalance;
	
	public AccountClass(int AccountNum,String AccountName,double AccBalance){
		this.AccountNum=AccountNum;
		this.AccountName=AccountName;
		this.AccBalance= AccBalance;
	}
	public void Deposit(double Amt){
		if(Amt<=0) {
			throw new ArithmeticException("Amount should be positive to be deposited!!");
		}else {
			AccBalance=AccBalance+Amt;
			System.out.println("Money Deposited:" + Amt);
		}
	 }
	public void withdraw(double Amt) throws InsufficientBalanceException{
		if(Amt<0) {
			throw new ArithmeticException("Amount must be positive to withdraw!!");
		}
		if(Amt > AccBalance){
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {
			AccBalance -= Amt;
			System.out.println("Withdrawn amount: " + Amt );
		}
	 }
		public void showBalance() {
			System.out.println("Account Number: "+ AccountNum);
			System.out.println("Account Name: "+ AccountName);
			System.out.println("Account Balance: "+ AccBalance);
	
		}
	}
