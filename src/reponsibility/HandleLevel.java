package reponsibility;

public abstract class HandleLevel { // change of reponsibility
	
	protected HandleLevel nextLevel;
	
	public void setNextLevel(HandleLevel nextLevel) {
		this.nextLevel = nextLevel;
	}
	
	public abstract void dispense(int numOfReport);

}
