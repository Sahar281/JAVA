

public class Employee extends Person {

	// employee characters in addition to person characters
	protected int EmployeeNO = 0;
	protected int YearsOfSeniority;

	// const variables for salary calculation
	private final int BASE = 5000;
	private final int EACHYEAR = 500;

	// employee contructor calls super (person)
	public Employee(int employeeID, String employeeName, int employeeNO, int yearsOfSeniority) {
		super(employeeID, employeeName);
		this.EmployeeNO = employeeNO;
		this.YearsOfSeniority = yearsOfSeniority;

	}

	// getter for employee id -calles super ID
	public int getEmployeeID() {
		return super.ID;
	}

	// getter for employee name -calles super Name
	public String getEmployeeName() {
		return super.Name;
	}

	// setter for employee name -change at super name
	public void setEmployeeName(String name) {
		super.Name = name;
	}

	// getter for employee Number -calles super number
	public int getEmployeeNO() {
		return EmployeeNO;
	}

	// setter for employee Number -change at super Number
	public void setEmployeeNO(int number) {
		EmployeeNO = number;
	}

	// getter for employee seniority -calles super seniority
	public int getYearsOfSeniority() {
		return YearsOfSeniority;
	}

	// setter for employee seniority -add at super seniority +amonu of years
	public void setYearsOfSeniority(int yearsAdded) {
		YearsOfSeniority += yearsAdded;
	}

	// override super method getScore
	@Override
	protected int getScore() {
		int score = 4 + YearsOfSeniority;
		return score;
	}

	// override super method getSalary
	@Override
	protected int getSalery() {
		int salary = BASE + (EACHYEAR * YearsOfSeniority);
		return salary;
	}

	// override super method sing
	@Override
	protected void sing() {
		System.out.println("Hello, its me");
	}

	// method to string overrides object method toString
	@Override
	public String toString() {
		return "employee id: " + getEmployeeID() + ", employee name: " + getEmployeeName() + ", employee NO: "
				+ getEmployeeNO() + ", years of seniority: " + getYearsOfSeniority();
	}

	// override equals method and check equality between YearsOfSeniority
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return YearsOfSeniority == other.YearsOfSeniority;
	}
	
	public boolean deserveSpecialBouns() {
		if (getYearsOfSeniority()>=5) {
			return true;
		}
		return false;
	}
}
