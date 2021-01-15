package hieu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import cheff.CheffDzung;
import cheff.CheffHieu;
import leader.BigBoss;
import leader.LeaderShift;
import makeFood.ICookCommand;
import makeFood.MakeBeefBread;
import makeFood.MakeBeefBurger;
import makeFood.MakeBeefStew;
import makeFood.MakeCheesePizza;
import makeFood.MakeChickenGrill;
import makeFood.MakeChickenPizza;
import makeFood.MakeGrilledLamp;
import makeFood.MakePorkBurger;
import makeFood.MakePorkGrill;
import makeFood.MakePorkPizza;
import reponsibility.HandleLevel;
import waiter.Waitress;

public class Restaurant {
	private static  ArrayList<Dish> arrMenu = new ArrayList<>();//Khởi tạo menu là list các món ăn
	public static int sum = 0;					// Tạo 1 biến tatic kiểu int để tính tổng tiền
	
	public static void main(String[] args) {
		int x  = 20;							
        String name = "";
		initMenu();								//Phương thức này add món vào menu
		CheffHieu cheffHieu = CheffHieu.getInstance();		// đây là 2 đầu bếp cụ thể nên dùng singleton
		CheffDzung cheffDzung = CheffDzung.getInstance();
		
		ICookCommand makeChickenGrill = new MakeChickenGrill(cheffHieu,arrMenu.get(0));			//Tạo các command ứng với món ăn
		ICookCommand makeChickenPizza = new MakeChickenPizza(cheffHieu,arrMenu.get(1));
		ICookCommand makeBeefStew 	  = new MakeBeefStew(cheffHieu,arrMenu.get(2));
		ICookCommand makeBeefBread    = new MakeBeefBread(cheffHieu,cheffDzung,arrMenu.get(3));
		ICookCommand makeBeefBurger   = new MakeBeefBurger(cheffHieu,cheffDzung,arrMenu.get(4));		
		ICookCommand makeCheesePizza  = new MakeCheesePizza(cheffHieu,cheffDzung,arrMenu.get(5));
		ICookCommand makePorkPizza    = new MakePorkPizza(cheffDzung,cheffHieu,arrMenu.get(6));
		ICookCommand makePorkBurger   = new MakePorkBurger(cheffDzung,arrMenu.get(7));
		ICookCommand makePorkGrill    = new MakePorkGrill(cheffDzung,arrMenu.get(8));
		ICookCommand makeGrilledLamp  = new MakeGrilledLamp(cheffDzung,arrMenu.get(9));
		
		Waitress waitress = new Waitress();					//Tạo bồi bàn
		HandleLevel leader = new LeaderShift();				//Tạo trưởng ca
		HandleLevel boss = BigBoss.getInstance();			//Ông chủ chỉ có một nên dùng singleton
		waitress.setNextLevel(leader);						//Việc xử lí phàn nàn người đầu tiên luôn tiếp nhận là bồi bàn
		leader.setNextLevel(boss);							//tiếp đến trưởng ca, cuối cùng là ông chủ
		boss.setNextLevel(null);
		
		while(true) {												
	    	   System.out.println("\nHello, what your name ?\n");
	           Scanner k = new Scanner(System.in);
	           name = k.nextLine();
	           System.out.println("Hi, " + name +",please chose your food you want!\nLest see the menu\n");
	           showMenu();			//Hiện danh sách món ăn
	           
	   		while( x != 0) {				//Xác nhận yêu cầu của khách theo số nhập vào
	           	x = custommerChoiceOrder();			//nhận số từ bàn phím, kiểm tra, trả về kết quả rồi gán vào x
	               switch(x) {
	               case 1:waitress.addFoodToOrder(makeChickenGrill);
	               break;
	               case 2:waitress.addFoodToOrder(makeChickenPizza);
	               break;
	               case 3:waitress.addFoodToOrder(makeBeefStew);
	               break;
	               case 4:waitress.addFoodToOrder(makeBeefBread);
	               break;
	               case 5:waitress.addFoodToOrder(makeBeefBurger);
	               break;
	               case 6:waitress.addFoodToOrder(makeCheesePizza);
	               break;
	               case 7:waitress.addFoodToOrder(makePorkPizza);
	               break;
	               case 8:waitress.addFoodToOrder(makePorkBurger);
	               break;
	               case 9:waitress.addFoodToOrder(makePorkGrill);
	               break;
	               case 10:waitress.addFoodToOrder(makeGrilledLamp);
	               break;
	               default: break;
	               }
	           }
	   		x = 20;			
	   		waitress.sendOrderToCheff();    //Gửi tất cả các món trong order cho đầu bếp
	   		waitress.completeOrder();		//Xóa order 
	   		setTotalBill();					//Thanh toán
	   		sum = 0;
	   		System.out.println("\nAre you have a good meal ?\n");
	   		System.out.println("1: Very good \n2: Waiting food for along time \n3: The food is not good \n4: Payment is incorrect ");
	   		int reportNum = custommerChoiceReport();		// Nhận report từ khách
	   		System.out.println("name, " + "report number: " + reportNum);
	   		waitress.dispense(reportNum);		// bồi bàn xử lí đầu tiên, không được thì lên cấp tiếp theo..
	   		System.out.println("Thanks you so much and see you soon !!!\n\n\n\n");
		}      
			
	}


	private static void showMenu() { // Show menu
		System.out.println("=======================Menu=====================================");
		System.out.println("=======Order number=======Name of dish==========Prize===========");
		for(Dish dish : arrMenu) {
			System.out.println("\t " + dish.getId() + "\t " + dish.getName()  + "\t\t\t " + dish.getPrice());
		}
		System.out.println("Please chose your food by enter (Order Number) in your keyboard\n");
		System.out.println("If you want to finish order, please enter (0) number!");
	}
	
	private static void initMenu() {  // Add menu
		arrMenu.add(new Dish(1,"Chicken grill",50));
		arrMenu.add(new Dish(2, "Chicken pizza", 60));
		arrMenu.add(new Dish(3,"Beef stew", 70));
		arrMenu.add(new Dish(4, "Beef bread", 40));
		arrMenu.add(new Dish(5, "Beef burger", 90));
		arrMenu.add(new Dish(6, "Cheese pizza", 100));
		arrMenu.add(new Dish(7, "Pork pizza", 120));
		arrMenu.add(new Dish(8, "Pork burger", 150));
		arrMenu.add(new Dish(9, "Pork grill", 200));
		arrMenu.add(new Dish(10, "Grilled lamb", 180));
	}

	public static int custommerChoiceOrder() { // Check sự kiện nhập từ bàn phím lúc order
		int choice = 0;
	    try {
	    	Scanner k = new Scanner(System.in);
	        String inStr = k.nextLine();
	        int inInt = Integer.parseInt(inStr); // sẽ tạo ra exception nếu nhận vào không phải số
	        if (inInt < 0 || inInt > 10) // Nếu số nhập vào nằm ngoài vùng yêu cầu sẽ bị loại
	        {
	            System.out.println("Error. You have to choose a number from 0 to 10");
	            custommerChoiceOrder(); // chạy lại phương thức
	        }
	        else
	        {
	           choice = inInt; // thỏa mãn thì gán cho biến choice
	           
	        }
	    }
	    catch (NumberFormatException ex) // nếu lỗi thì vào đây
	    {
	        System.out.println("Invalid input! You have to enter a number");
	        custommerChoiceOrder();  // Chạy lại
	    }
		return choice; //Trả về choice
	}
	
	public static int custommerChoiceReport() { // tương tự như ở trên chỉ thay đổi vùng yêu cầu
		int choice = 0;
	    try {
	    	Scanner k = new Scanner(System.in);
	        String inStr = k.nextLine();
	        int inInt = Integer.parseInt(inStr); 
	        if (inInt < 0 || inInt > 4) 
	        {
	            System.out.println("Error. You have to choose a number from 0 to 4");
	            custommerChoiceOrder();
	        }
	        else
	        {
	           choice = inInt;
	           
	        }
	    }
	    catch (NumberFormatException ex) 
	    {
	        System.out.println("Invalid input! You have to enter a number");
	        custommerChoiceOrder();
	    }
		return choice;
	}
	public static void setTotalBill() { // Giả lập việc thanh toán bị sai
		Random random = new Random();
		int i =  random.nextInt(5);
		if(i == 0) {
			System.out.println("Total bill is: " + sum + " (Correct)");
		} else {
			sum += 50;
			System.out.println("Total bill is: " + sum  + "(Incorrect)");
		}
			
		

	}
}
