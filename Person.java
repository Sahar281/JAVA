
public abstract class Person {

	// characterst for abstruct method
	protected final int ID;
	protected String Name;

	// constructor
	public Person(int id, String name) {
		this.ID = id;
		this.Name = name;
	}

	// abstruct methods
	protected abstract int getScore();

	protected abstract int getSalery();

	protected abstract void sing();

}
