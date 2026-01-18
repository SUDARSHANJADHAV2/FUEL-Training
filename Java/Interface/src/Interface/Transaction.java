package Interface;

public class Transaction {

	public static void main(String[] args) {
		Payment T1=new CreditCard();
		T1.pay();
		Payment T2=new DebitCard();
		T2.pay();
		Payment T3=new UPI();
		T3.pay();
	}

}
