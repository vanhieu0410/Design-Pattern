package waiter;

import java.util.ArrayList;

import makeFood.ICookCommand;
import reponsibility.HandleLevel;

public class Waitress extends HandleLevel { //bồi bàn extends HandleLevel vì cũng tiếp nhận phàn nàn
	ICookCommand iCommand;			
	ArrayList<ICookCommand> arrOrDer = new ArrayList<ICookCommand>(); // tạo list chứa các command tạo thành 1 order
	
	public void addFoodToOrder(ICookCommand icmd) { //Thêm món vào order
		arrOrDer.add(icmd);
	}

	public void sendOrderToCheff() {			// gửi tất cả các command đi
		for(ICookCommand i : arrOrDer) {
			i.excuted();
		}
	}
	
	public void completeOrder() {		//xóa order
		arrOrDer.clear();
	}

	@Override
	public void dispense(int numOfReport) { // phần xử lí của phàn nàn
		if(numOfReport == 2) {
			System.out.println("Waitress talks: we are very sorry for the long wait, we will try to work better!! ");
		} else if (this.nextLevel != null) {
			this.nextLevel.dispense(numOfReport);
		}
		
		
	}
}
