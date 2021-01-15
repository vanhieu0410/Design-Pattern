package makeFood;

import java.util.Random;

import cheff.CheffDzung;
import cheff.CheffHieu;
import hieu.Dish;
import hieu.Restaurant;

public class MakeBeefBread implements ICookCommand{ //Class làm các món ăn
											//món này thì cả 2 đầu bếp đều làm được
	CheffHieu cheffhieu;
	CheffDzung cheffDzung;
	Dish dish;							// nhận về đối tượng đồ ăn để tính tiền
	Random random = new Random();

	public MakeBeefBread(CheffHieu cheffHieu,CheffDzung cheffDzung, Dish dish) {
		this.cheffhieu = cheffHieu;
		this.cheffDzung = cheffDzung;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		int numOfRan = random.nextInt(2);
        if(numOfRan == 1) {					// chọn ngẫu nhiên 1 trong 2 người
        	cheffhieu.cookBeefBread();
        } else {
        	cheffDzung.cookBeefBread();
        }
        Restaurant.sum += dish.getPrice(); // tính tiền
	}

}
