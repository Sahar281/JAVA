

//subclass of payment//
public class CreditCard extends Payment {
	private double cardNumber;
	private int paymentsToPay;

//constructor//
	public CreditCard(double amount, double cardNumber, int paymentsToPay) {
		super(amount);
		this.cardNumber = cardNumber;
		this.paymentsToPay = paymentsToPay;
	}

}
