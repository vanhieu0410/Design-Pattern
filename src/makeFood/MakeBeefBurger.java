package makeFood;

import java.util.Random;

import cheff.CheffDzung;
import cheff.CheffHieu;
import hieu.Dish;
import hieu.Restaurant;

public class MakeBeefBurger implements ICookCommand { // mô tả trong MakeBeefBread class vì chúng tương tự
	CheffHieu cheffHieu;
	CheffDzung cheffDzung;
	Dish dish;
	Random random = new Random();

	public MakeBeefBurger(CheffHieu cheffHieu,CheffDzung cheffDzung, Dish dish) {
		this.cheffHieu = cheffHieu;
		this.cheffDzung = cheffDzung;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		int numOfRan = random.nextInt(2);
        if(numOfRan == 1) {
        	cheffHieu.cookBeefBurger();
        } else {
        	cheffDzung.cookBeefBurger();
        }
        Restaurant.sum += dish.getPrice();
	}

}
