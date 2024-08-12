
public class Project {

	// Array of employees with up to 15 employees
	protected Employee[] Team = new Employee[15];

	// add employee func checks if employee is not a manager and if there is enogh
	// room for new employee - if so he shell be added to Team
	public boolean AddEmployee(Employee TeamMember) {
		for (int i = 0; i < Team.length; i++) {
			if ((TeamMember.getClass() != ProjectManager.class) && (TeamMember.getClass() != null)) {
				Team[i] = TeamMember;
				return true;
			}
		}
		return false;
	}

	// getTeam func
	public Employee[] getTeam() {
		return Team;
	}
}
