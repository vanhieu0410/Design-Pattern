package makeFood;

import cheff.CheffHieu;
import hieu.Dish;
import hieu.Restaurant;

public class MakeBeefStew implements ICookCommand{// mô tả trong MakeBeefBread class vì chúng tương tự
	CheffHieu cheffHieu;
	Dish dish;

	public MakeBeefStew(CheffHieu cheffHieu, Dish dish) {
		this.cheffHieu = cheffHieu;
		this.dish = dish;
	}
	@Override
	public void excuted() {
		cheffHieu.cookBeefStew();
		Restaurant.sum += dish.getPrice();
		
	}

}
