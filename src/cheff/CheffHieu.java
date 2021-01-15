package cheff;

import java.util.Random;

public class CheffHieu { // Lớp đầu bếp có tên cụ thể, sử dụng singleton
						// chứa các phương thức nấu đồ ăn
	
	private CheffHieu() {
		
	}
	private static class CheffHieuSingleton {
		private static final CheffHieu INSTANCE = new CheffHieu();
	}
	
	public static CheffHieu getInstance() {
		return CheffHieuSingleton.INSTANCE;
	}
	Random ran = new Random();
	public void cookChickenGrill() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Chicken Grill ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Chicken Grill ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Chicken Grill ready - Cook by Hieu - Status: (Good)");
		}
	}

	
	public void cookChickenPizza() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Chicken Pizza ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Chicken Pizza ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Chicken Pizza ready - Cook by Hieu - Status: (Good)");
		}
	}
	
	public void cookBeefStew() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Beef Stew ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Beef Stew ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Beef Stew ready - Cook by Hieu - Status: (Good)");
		}
	}
	
	public void cookBeefBread() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Beef Bread ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Beef Bread ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Beef Bread ready - Cook by Hieu - Status: (Good)");
		}
	}
	
	public void cookBeefBurger() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Beef Burger ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Beef Burger ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Beef Burger ready - Cook by Hieu - Status: (Good)");
		}
	}
	
	public void cookCheesePizza() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Cheese Pizza ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Cheese Pizza ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Cheese Pizza ready - Cook by Hieu - Status: (Good)");
		}
	}
	
	public void cookPorkPizza() {
		int x = ran.nextInt(10);
		if(x == 0) {
			System.out.println("Pork Pizza ready - Cook by Hieu - Status: (Broken)");
		} else if(1<= x && x<= 3){
			System.out.println("Pork Pizza ready - Cook by Hieu - Status: (Perfect)");
		} else {
			System.out.println("Pork Pizza ready - Cook by Hieu - Status: (Good)");
		}
	}
}
