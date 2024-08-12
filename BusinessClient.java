
import java.util.ArrayList;

//subclass of Client//
public class BusinessClient extends Client {
	private String companyName;

//constructor-note that it creates empty arraylist//
	public BusinessClient(int id, String name, String address, String companyName) {
		super(id, name, address);
		this.companyName = companyName;
		orderList = new ArrayList<Order>();
	}

	@Override
	public void addOrder(Order order) {
		order.giveDiscount(0.05);
		orderList.add(order);
	}

}
