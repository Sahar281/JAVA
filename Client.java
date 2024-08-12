
import java.util.ArrayList;

public class Client {
	protected int id;
	protected String name, address;
	protected ArrayList<Order> orderList;

//constructor//
	public Client(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		orderList = new ArrayList<Order>();
	}

//adds order to client order list//
	public void addOrder(Order order) {
		orderList.add(order);
	}

//prints client details+orders//
	public void print() {
		System.out.println("CLIENT DETAILS : ");
		System.out.println("ID: " + id);
		System.out.println("Name " + name);
		if (orderList.size() == 0) {
			System.out.println("There are no order existing for this client");
		} else {
			for (int i = 0; i < orderList.size(); i++) {
				System.out.println(orderList.get(i));
			}
		}
	}
}