package makeFood;

import cheff.CheffHieu;
import hieu.Dish;
import hieu.Restaurant;

public class MakeChickenPizza implements ICookCommand{// mô tả trong MakeBeefBread class vì chúng tương tự
	CheffHieu cheffHieu;
	Dish dish;
	
	public MakeChickenPizza(CheffHieu cheffHieu, Dish dish) {
		this.cheffHieu = cheffHieu;
		this.dish = dish;
	}

	@Override
	public void excuted() {
		cheffHieu.cookChickenPizza();
		Restaurant.sum += dish.getPrice();
	}

}
