package makeFood;

import java.util.Random;

import cheff.CheffDzung;
import cheff.CheffHieu;
import hieu.Dish;
import hieu.Restaurant;

public class MakePorkPizza implements ICookCommand{// mô tả trong MakeBeefBread class vì chúng tương tự
	CheffDzung cheffDzung;
	CheffHieu cheffHieu;
	Dish dish;
	Random random = new Random();

	public MakePorkPizza(CheffDzung cheffDzung,CheffHieu cheffHieu, Dish dish) {
		this.cheffDzung = cheffDzung;
		this.cheffHieu = cheffHieu;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		int numOfRan = random.nextInt(2);
        if(numOfRan == 1) {
        	cheffHieu.cookPorkPizza();
        } else {
        	cheffDzung.cookPorkPizza();
        }
        Restaurant.sum += dish.getPrice();
	}
}
