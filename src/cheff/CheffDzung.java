package cheff;

import java.util.Random;

public class CheffDzung { // Lớp đầu bếp có tên cụ thể, sử dụng singleton
	private CheffDzung() {// chứa các phương thức nấu đồ ăn
						// có tỉ lệ nấu ra đồ ăn ngon, hoàn hảo và hỏng
	}
	private static class CheffDzungSingleton {
		private static final CheffDzung INSTANCE = new CheffDzung();
	}
	
	public static CheffDzung getInstance() {
		return CheffDzungSingleton.INSTANCE;
	}
	
	Random ran = new Random();
	public void cookGrilledLamp() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Grilled Lamp ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Grilled Lamp ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Grilled Lamp ready - Cook by Dzung - Status: (Good)");
		}
	}

	
	public void cookPorkGrill() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Pork Grill ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Pork Grill ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Pork Grill ready - Cook by Dzung - Status: (Good)");
		}
	}
	
	public void cookPorkBurger() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Pork Burger ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Pork Burger ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Pork Burger ready - Cook by Dzung - Status: (Good)");
		}
	}
	
	public void cookPorkPizza() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Pork Pizza ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Pork Pizza ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Pork Pizza ready - Cook by Dzung - Status: (Good)");
		}
	}
	
	public void cookCheesePizza() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Cheese Pizza ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Cheese Pizza ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Cheese Pizza ready - Cook by Dzung - Status: (Good)");
		}
	}
	
	public void cookBeefBurger() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Beef Burger ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Beef Burger ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Beef Burger ready - Cook by Dzung - Status: (Good)");
		}
	}
	
	public void cookBeefBread() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Beef Bread ready - Cook by Dzung - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Beef Bread ready - Cook by Dzung - Status: (Perfect)");
		} else {
			System.out.println("Beef Bread ready - Cook by Dzung - Status: (Good)");
		}
	}
}
