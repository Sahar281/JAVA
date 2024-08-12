
public class Main {
//method count Staff desission by counting score of each employee and count pro vs against
	public static boolean IsAccepted(Object[] arr) {
		int pro = 0, against = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getClass() == Technician.class) {
				Technician other = (Technician) arr[i];
				pro += other.getScore();
			}
			if (arr[i].getClass() == Employee.class) {
				Employee other = (Employee) arr[i];
				pro += other.getScore();
			}
			if (arr[i].getClass() == BoardMember.class) {
				BoardMember other = (BoardMember) arr[i];
				against += other.getScore();
			}
			if (arr[i].getClass() == ProjectManager.class) {
				ProjectManager other = (ProjectManager) arr[i];
				against += other.getScore();
			}

		}
		if (pro > against) {
			return true;
		}
		return false;

	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating Company ,project and employee to enter the company
		Company goog = new Company();
		Project project1 = new Project();
		Employee E1 = new Employee(5654646, "alon", 07, 4);
		Employee E2 = new Employee(3154654, "shlomo", 03, 6);
		Employee E3 = new Technician(313256, "sho", 9, 13, 83);
		Employee E4 = new Technician(3154654, "omor", 05, 6, 36);
		Employee E5 = new BoardMember(3146354, "sooo", 87, 53, "ijshfk", 546);
		Employee E6 = new BoardMember(3364654, "shro", 07, 6, "hsdyvb", 5156);
		Employee E7 = new ProjectManager(3113654, "smo", 07, 6, project1);

		// adding employees to company
		goog.AddEmployee(E1);
		System.out.println(E1.Name + " added seccesfully");
		goog.AddEmployee(E2);
		System.out.println(E2.Name + " added seccesfully");
		goog.AddEmployee(E3);
		System.out.println(E3.Name + " added seccesfully");
		goog.AddEmployee(E4);
		System.out.println(E4.Name + " added seccesfully");
		goog.AddEmployee(E5);
		System.out.println(E5.Name + " added seccesfully");
		goog.AddEmployee(E6);
		System.out.println(E6.Name + " added seccesfully");
		goog.AddEmployee(E7);
		System.out.println(E7.Name + " added seccesfully");

		// creating new array of employees
		Employee[] arr1 = new Employee[7];

		// adding employeesto arr
		arr1[0] = E1;
		System.out.println(E1.Name + " added seccesfully");
		arr1[1] = E2;
		System.out.println(E1.Name + " added seccesfully");
		arr1[2] = E3;
		System.out.println(E1.Name + " added seccesfully");
		arr1[3] = E4;
		System.out.println(E1.Name + " added seccesfully");
		arr1[4] = E5;
		System.out.println(E1.Name + " added seccesfully");
		arr1[5] = E6;
		System.out.println(E1.Name + " added seccesfully");
		arr1[6] = E7;

		// print is accepted on arr
		System.out.println(IsAccepted(arr1));
	}

}
