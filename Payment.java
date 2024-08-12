
//Superclass for all ways of payments - cash,cheque,creditcard//
//basic amount,get,set and print function//
public class Payment {
	protected double amount;

	Payment(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void print() {
		System.out.println(amount + "Has been payed ");
	}

}
