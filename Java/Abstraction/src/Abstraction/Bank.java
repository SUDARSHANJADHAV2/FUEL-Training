package Abstraction;

public class Bank extends Gpay{
	public double balance =5000;
	@Override
	public double check_Balance() {
		return balance;
	}

	@Override
	public double deposit(double amount) {
		return amount+balance;
	}

	@Override
	public double withdraw(double amount) {
		if(balance>amount)
			return balance - amount;
		else {
			return 0;
		}
	}	
	
	public static void main(String[] args) {
		Gpay user = new Bank();
		System.out.println(""+user.check_Balance());
		System.out.println(""+user.deposit(100));
		System.out.println(""+user.withdraw(50));		
	}


}
