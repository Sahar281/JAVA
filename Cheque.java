
//subclass of Payment//
public class Cheque extends Payment {
	private int chequeNumber;
	private String nameOfBank;

//constructor//
	public Cheque(double amount, int chequeNumber, String nameOfBank) {
		super(amount);
		this.chequeNumber = chequeNumber;
		this.nameOfBank = nameOfBank;
	}

	@Override
	public void print() {
		System.out.println("The amount payed is " + amount);
		System.out.println("The cheque number is " + chequeNumber);
		System.out.println("The Bank name is " + nameOfBank);
	}

	public double getTotalAmount() {
		return amount;
	}
}
