

public class Technician extends Employee {

	// Technician characters in addition to employee & person characters
	private int NumOfComputers;

	// const variables for salary calculation
	private final int PRICEPERCOMPUTER = 250;

	// Technician constructor calls super (employee)
	public Technician(int employeeID, String employeeName, int employeeNO, int yearsOfSeniority, int numOfComputers) {
		super(employeeID, employeeName, employeeNO, yearsOfSeniority);
		this.NumOfComputers = numOfComputers;
	}

	// getter Technician- num of computers
	public int getNumOfComputers() {
		return NumOfComputers;
	}

	// get score override super get score and call super get score method and add
	// Technician benefits
	@Override
	protected int getScore() {
		int score = super.getScore() + getNumOfComputers();
		return score;
	}

	// getSalary override super getSalary and call super getSalary method and add
	// technician benefits
	@Override
	protected int getSalery() {
		int salary = super.getSalery() + (NumOfComputers / 10) * PRICEPERCOMPUTER;
		return salary;
	}

	// tostring override object & employee to string method and call super toString
	// method and add technician characters
	@Override
	public String toString() {
		return "technician" + super.toString() + "num of computers: " + getNumOfComputers();
	}

	// override equals method and check equality between YearsOfSeniority & num of
	// computers
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
		Technician other = (Technician) obj;
		return NumOfComputers == other.NumOfComputers;
		}
		return false;
	}
	@Override
	public boolean deserveSpecialBouns() {
		if (getNumOfComputers()>=100) {
			return true;
		}
		return false;
	}

}
