package makeFood;

import cheff.CheffDzung;
import hieu.Dish;
import hieu.Restaurant;


public class MakeGrilledLamp implements ICookCommand {// mô tả trong MakeBeefBread class vì chúng tương tự
	CheffDzung cheffDzung;
	Dish dish;

	public MakeGrilledLamp(CheffDzung cheffDzung, Dish dish) {
		this.cheffDzung = cheffDzung;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		cheffDzung.cookGrilledLamp();
		Restaurant.sum += dish.getPrice();
	}
}
