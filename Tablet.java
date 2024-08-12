

public class Tablet {
//tablet charecters
	private String name;
	private String kind;
	private char system;
	private double size;
	private double price;

	// default creation of tablet
	public Tablet() {
		// TODO Auto-generated constructor stub
		name = "apple";
		kind = "ipad";
		system = 'I';
		size = 20.0;
		price = 3559.99;
	}

//constractor which gets each parameter of qualities 
	public Tablet(String name, String kind, char system, double size, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kind = kind;
		this.system = system;
		this.size = size;
		this.price = price;
	}

//getters and setters 
//name getter
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

//kind getter
	public String getKind() {
		// TODO Auto-generated method stub
		return kind;
	}

//system getter
	public char getSystem() {
		// TODO Auto-generated method stub
		return system;
	}

//system setter +valiedation check
	public void setSystem(char s) {
		// TODO Auto-generated method stub
		while (s != 'W' && s != 'I' && s != 'A') {
			system = '0';
			System.out.println("invalied char please try again");
		}
		system = s;
	}

//size getter 
	public double getSize() {
		// TODO Auto-generated method stub
		return size;
	}

//price getter
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;

	}

//price setter
	public void setPrice(double P) {
		// TODO Auto-generated method stub
		price = P;
	}

// printing func
	public void print() {
		System.out.println("name is :" + name + " kind is :" + kind + " system is :" + system + " size is :" + size
				+ " price is :" + price);
	}

//copy constructor 
	public Tablet(Tablet other) {
		name = other.name;
		kind = other.kind;
		system = other.system;
		size = other.size;
		price = other.price;
		System.out.println("you have created other tablet");
	}

//func chnge name and kinf of two tabs to lower case and check if name, kind & size equal
	public boolean isSame(Tablet tab) {
		boolean flag = false;
		this.name.toLowerCase();
		tab.name.toLowerCase();
		this.kind.toLowerCase();
		tab.kind.toLowerCase();
		if (this.name.equals(tab.name) && this.kind.equals(tab.kind) && this.size == tab.size) {
			flag = true;
		}
		return flag;
	}
}