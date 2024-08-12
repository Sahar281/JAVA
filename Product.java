
public class Product {
	private String productName;
	private double price;

//constructor//
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

//prints product//
	public void print() {
		System.out.println("The price of " + productName + " is " + price);
	}

//getters and setters for product names//
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
