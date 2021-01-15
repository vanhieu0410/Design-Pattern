package leader;

import reponsibility.HandleLevel;

public class LeaderShift extends HandleLevel{ // trưởng ca có thể có nhiều vì nhiều chi nhánh
	
	public LeaderShift() {
		super();
	}

	@Override
	public void dispense(int numOfReport) {
		if(numOfReport == 3) {
			System.out.println("Leader Shift talk: I will remind the chef to work more carefully. So sorry Sir!");
			
		} else if(this.nextLevel != null){
			this.nextLevel.dispense(numOfReport);
		}
	}

}
