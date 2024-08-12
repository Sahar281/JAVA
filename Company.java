
public class Company {

	// company characters
	public Employee[] Staff;
	public int Current = 0;
	public static int MAX = 200;

	// constructor
	public Company() {
		this.Staff=new Employee[MAX];
		this.Current = 0;

	}
	// boolean method adds employee to company
	public boolean AddEmployee(Employee e) {
		// if directorion desision method T/F
		if (Current < MAX) {
			Staff[Current+1] = e;
			Current++;
			return true;
		}

		return false;
	}
//count total salery of employees
	public double TotalSalary() {
		double sum = 0.0;
		for (int i = 0; i < Current; i++) {
			sum += Staff[i].getSalery();
		}
		return sum;
	}

	//checks if employee deserve special bounus
	public void giveSpecialBouns() {
		int emp = 0, tech = 0;
		for (int i = 0; i < Current; i++) {
			if ((Staff[i].getClass() == Technician.class) && (Staff[i].deserveSpecialBouns() == true)) {
				tech++;
			}
			if ((Staff[i].getClass() == Employee.class) && (Staff[i].deserveSpecialBouns() == true)) {
				emp++;
			}
		}
		System.out.println("employee: " + emp + " tecknician: " + tech);
	}

}
