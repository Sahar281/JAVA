
public class ProjectManager extends Employee {

	// ProjectManager characters in addition to employee & person characters
	private Project ProjectName;

	private final int TECKMEMBER = 100;
	private final int BOARDMEMBER = 50;

	// ProjectManager constructor calls super (employee)
	public ProjectManager(int employeeID, String employeeName, int employeeNO, int yearsOfSeniority,
			Project projectName) {
		super(employeeID, employeeName, employeeNO, yearsOfSeniority);
		this.ProjectName = projectName;
	}

	// getter Project name
	public Project getProjectName() {
		return ProjectName;
	}

	// setter project name
	public void setProjectName(Project projectname) {
		this.ProjectName = projectname;
	}

	// get score override super get score and call super get score method and add
	// ProjectManager team and add all team score combine
	@Override
	protected int getScore() {
		int totalScore = 0;
		for (int i = 0; i < ProjectName.getTeam().length && ProjectName.getTeam()[i] != null; i++) {
			totalScore += ProjectName.getTeam()[i].getScore();
		}
		totalScore += super.getScore();
		return totalScore;
	}

	// getSalary override super getSalary and call super getSalary method and add
	// ProjectManager benefits for each technician add 100 NIS for evry board member
	// add 50 NIS
	@Override
	public int getSalery() {
		int salary, numOfTechMembers = 0, numOfBoardMember = 0;
		for (int i = 0; i < ProjectName.getTeam().length; i++) {
			if (ProjectName.getTeam()[i].getClass().equals(Technician.class)) {
				numOfTechMembers++;
			} else if (ProjectName.getTeam()[i].getClass().equals(BoardMember.class)) {
				numOfBoardMember++;
			}
		}
		salary = super.getSalery() + (TECKMEMBER * numOfTechMembers) + (BOARDMEMBER * numOfBoardMember);
		return salary;
	}

	// tostring override object & employee to string method and call super toString
	// method and add ProjectManager characters
	@Override
	public String toString() {
		return "manager" + super.toString() + "project name: " + getProjectName();
	}

	// override equals method and check equality between YearsOfSeniority & num of
	// employees on the team
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			ProjectManager other = (ProjectManager) obj;
			return (ProjectName.getTeam().length == other.ProjectName.getTeam().length);
		}
		return false;
	}
}