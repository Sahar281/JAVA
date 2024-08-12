
import java.util.ArrayList;

public class Order {
	// arraylists for order items and cash,cheque,credit payments//
	private ArrayList<Product> itemList;
	private ArrayList<Cash> cashPayment;
	private ArrayList<Cheque> chequePayment;
	private ArrayList<CreditCard> CreditCard;

//constructor//
	public Order() {
		itemList = new ArrayList<Product>();
		cashPayment = new ArrayList<Cash>();
		chequePayment = new ArrayList<Cheque>();
		CreditCard = new ArrayList<CreditCard>();
	}

//adds product to item list//
	public void addProduct(Product product) {
		itemList.add(product);
	}

//returns order cost//
	public double getTotalOrderPrice() {
		double sum = 0;
		for (int i = 0; i < itemList.size(); i++) {
			sum += itemList.get(i).getPrice();
		}
		return sum;
	}

//adds payment to creditcard arraylist//
	public void addPayment(CreditCard credit) {
		CreditCard.add(credit);
		checkIfOrderIsFullyPaid();
	}

//adds payment to cheque payment arraylist//
	public void addPayment(Cheque cheque) {
		chequePayment.add(cheque);
		checkIfOrderIsFullyPaid();
	}

//adds payment to cash payment arraylist//
	public void addPayment(Cash cash) {
		cashPayment.add(cash);
		checkIfOrderIsFullyPaid();
	}

//sums all payments and the order cost and prints according to situation//
	public void checkIfOrderIsFullyPaid() {
		double payedSum = 0;
		for (int i = 0; i < cashPayment.size(); i++) {
			payedSum += cashPayment.get(i).getAmount();
		}
		for (int i = 0; i < chequePayment.size(); i++) {
			payedSum += chequePayment.get(i).getAmount();
		}
		for (int i = 0; i < CreditCard.size(); i++) {
			payedSum += CreditCard.get(i).getAmount();
		}
		if (payedSum == getTotalOrderPrice()) {
			System.out.println("The order has been paid correctly");
		}
		if (payedSum > getTotalOrderPrice()) {
			System.out.println("The payment exceeded the order cost by " + (payedSum - getTotalOrderPrice()));
		}
		if (payedSum < getTotalOrderPrice()) {
			System.out.println((getTotalOrderPrice() - payedSum) + " Is missing from completing the order");
		}
	}

//gives discount on an order//
	public void giveDiscount(double discountInPercent) {
		for (int i = 0; i < itemList.size(); i++) {
			double oldPrice = itemList.get(i).getPrice();
			itemList.get(i).setPrice(oldPrice * (1 - discountInPercent));
		}
	}

//prints all order information//
	public void print() {
		System.out.println("ORDER INFORMATION :");
		System.out.println("Item list:");
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i).getProductName() + " for the price of " + itemList.get(i).getPrice());
		}
		System.out.println("For the total amount of " + getTotalOrderPrice());
		System.out.println("Payment methods :");
		for (int i = 0; i < cashPayment.size(); i++) {
			System.out.println("Cash payment number" + (i + 1) + "for the amount of " + cashPayment.get(i).getAmount());
		}
		for (int i = 0; i < chequePayment.size(); i++) {
			System.out.println(
					"Cheque payment number" + (i + 1) + "for the amount of " + chequePayment.get(i).getAmount());
		}
		for (int i = 0; i < CreditCard.size(); i++) {
			System.out.println(
					"Credit card payment number" + (i + 1) + "for the amount of " + CreditCard.get(i).getAmount());
		}
	}

}
