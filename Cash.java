
//subclass of Payment//
public class Cash extends Payment {

	public Cash(double amount) {
		super(amount);
	}

	public double getTotalAmount() {
		return amount;
	}

}
