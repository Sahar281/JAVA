import java.util.ArrayList;

public class Store {
	private ArrayList<Client> clientList;
	private ArrayList<BusinessClient> businessClientList;

//constructor-creates empty client lists//
	Store() {
		this.clientList = new ArrayList<Client>();
		this.businessClientList = new ArrayList<BusinessClient>();
	}

//adds regular client to client list//
	public void addClient(Client client) {
		clientList.add(client);
	}

//adds business client to business client list//
	public void addBusinessClient(BusinessClient businessClient) {
		businessClientList.add(businessClient);
	}

//prints store clients and thier orders//
	public void print() {
		if (clientList.size() == 0) {
			System.out.println("Client list is empty");
		} else {
			for (int i = 0; i < clientList.size(); i++) {
				clientList.get(i).print();
			}
		}
		if (businessClientList.size() == 0) {
			System.out.println("Business client list is empty");
		} else {
			for (int i = 0; i < businessClientList.size(); i++) {
				businessClientList.get(i).print();

			}
		}
	}
}
