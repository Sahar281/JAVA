
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

public class TrickTruck {
// class charecters
	private ArrayList<Payment> payments = new ArrayList<>();
	private ArrayList<Payment>[] payment = new ArrayList[30];
	private ArrayList<Integer> cars = new ArrayList<>();
	private ArrayList<String> drivers = new ArrayList<>();

//partial constructor 
	public TrickTruck(ArrayList<Integer> C, ArrayList<String> D) {
		this.cars = C;
		this.drivers = D;
		for (int i = 0; i < 30; i++) {
			payment[i] = payments;
		}
	}

// array list of payment getter
	public ArrayList<Payment> getPayment() {
		return payments;
	}

	// array list of payment setter
	public void setPayment(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	// array of payment detailes getter
	public ArrayList<Payment>[] getPay() {
		return payment;
	}

	// array of payment detailes setter
	public void setPay(ArrayList<Payment>[] P) {
		this.payment = P;
	}

	// array list of cars getter
	public ArrayList<Integer> getCars() {
		return cars;
	}

	// array list of cars setter
	public void setCars(ArrayList<Integer> C) {
		this.cars = C;
	}

	// array list of drivers getter
	public ArrayList<String> getDrivers() {
		return drivers;
	}

	// array list of drivers setter
	public void setDrivers(ArrayList<String> D) {
		this.drivers = D;
	}

	// validation check of exist driver in array list
	public boolean existDriver(String D) {
		for (int i = 0; i < drivers.size(); i++) {
			if (D.equals(drivers.get(i))) {
				return true;
			}
		}
		return false;
	}

	// validation check of exist cars in array list
	public boolean existCar(int C) {
		for (int i = 0; i < cars.size(); i++) {
			if (C == cars.get(i)) {
				return true;
			}
		}
		return false;
	}

	// bool func checks if employee worked in a specific day
	public boolean worked(String name, int day) {
		for (int i = 0; i < payment.length; i++) {
			for (int j = 0; j < payment[i].size(); j++) {
				if (day == payment[i].get(j).getDay()) {
					if (name.equals(payment[i].get(j).getName())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	// func gets Payment and checks valiedation of name in employee list & License
	// Plate
	// then adds payment into arreay list in the pase by its charecters
	public boolean addPayment(Payment P) {
		if (existDriver(P.getName())) {
			if (existCar(P.getLicensePlate())) {
				for (int i = 0; i < payment.length; i++) {
					for (int j = 0; j < payment[i].size(); j++) {
						if (P.getDay() == payment[i].get(j).getDay()) {
							Payment nPay = new Payment(P);
							payment[i].add(nPay);
							System.out.println("paymen insert successfully");
							return true;
						}
					}
				}
			}
		}
		System.out.println("payment hasent inserted");
		return false;
	}

	// bool func gets Payment and checks valiedation of day in month, License Plate,
	// drivers name
	// & amount then adds payment into arreay list in the pase by its charecters and
	// print
	public boolean addPayment(short day, int licensePlate, String name, int amount) {
		if (existDriver(name)) {
			if (existCar(licensePlate)) {
				Payment P = new Payment(day, licensePlate, name, amount);
				for (int i = 0; i < payment.length; i++) {
					for (int j = 0; j < payment[i].size(); j++) {
						if (day == payment[i].get(j).getDay()) {
							payment[i].add(P);
							System.out.println("payment added successfully");
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	// count amount of fuel fueled in certain month in one car
	public double totalFuel(int plate) {
		double count = 0;
		for (int i = 0; i < payment.length; i++) {
			for (int j = 0; j < payment[i].size(); j++) {
				if (plate == payment[i].get(j).getLicensePlate()) {
					count = totalFuel(plate);
					count += payment[i].get(j).getAmount();
				}
			}
		}
		return count;
	}

	// count amount of fuel fueled in certain day in one car
	public double totalFuel(int plate, int day) {
		double count = 0;
		for (int i = 0; i < payment.length; i++) {
			for (int j = 0; j < payment[i].size(); j++) {
				if (day == payment[i].get(j).getDay()) {
					count = totalFuel(plate);
				}
			}
		}
		return count;
	}
}
