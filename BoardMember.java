

public class BoardMember extends Employee {

	// BoardMember characters in addition to employee & person characters
	private String BoardName;
	private int YearsOfBoardMembership;

	// board member constructor calls super (employee)
	public BoardMember(int employeeID, String employeeName, int employeeNO, int yearsOfSeniority, String boardName,
			int yearsOfBoardMembership) {
		super(employeeID, employeeName, employeeNO, yearsOfSeniority);
		this.BoardName = boardName;
		this.YearsOfBoardMembership = yearsOfBoardMembership;
	}

	// getter boardmember- for boardname
	public String getBoardName() {
		return BoardName;
	}

	// getter boardmember- for board membership years
	public int getYearsOfBoardMembership() {
		return YearsOfBoardMembership;
	}

	// setter boardmember- for board membership years
	public void setYearsOfBoardMembership(int addedYears) {
		YearsOfBoardMembership += addedYears;
	}

	// get score override super get score and call super get score method and add
	// board member benefits
	@Override
	protected int getScore() {
		int score = super.getScore() + (getYearsOfBoardMembership() * 2);
		return score;
	}

	// tostring override object & employee to string method and call super toString
	// method and add board member characters
	@Override
	public String toString() {
		return "board" + super.toString() + "board name: " + getBoardName();
	}

	// override equals method and check equality between BoardName & YearsOfSeniority
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
		BoardMember other = (BoardMember) obj;
		return BoardName == other.BoardName;
		}
		return false;
	}


}
