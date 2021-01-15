package makeFood;

import cheff.CheffDzung;
import hieu.Dish;
import hieu.Restaurant;

public class MakePorkBurger implements ICookCommand{// mô tả trong MakeBeefBread class vì chúng tương tự
	CheffDzung cheffDzung;
	Dish dish;

	public MakePorkBurger(CheffDzung cheffDzung, Dish dish) {
		this.cheffDzung = cheffDzung;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		cheffDzung.cookPorkBurger();
		Restaurant.sum += dish.getPrice();
	}
}
