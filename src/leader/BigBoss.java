package leader;

import reponsibility.HandleLevel;

public class BigBoss extends HandleLevel{ //chỉ có 1 sếp: singleton
	
	private BigBoss() {
		super();
	}
	
	private static class BigBossSingleton {
		private static final BigBoss INSTANCE = new BigBoss();
	}
	
	public static BigBoss getInstance() {
		return BigBossSingleton.INSTANCE;
	}
	@Override
	public void dispense(int numOfReport) {
		if(numOfReport == 4) {
			System.out.println("Big boss talk: I have recalculated your bill, i will give you a voucher instead of apologyze !");
			
		} else if(this.nextLevel != null){
			this.nextLevel.dispense(numOfReport);
		}
		
	}

}
