package Models.Order;

import Models.Chocolate.Chocolate;

public class ChocolateOrder {
	public int amount;
	public Chocolate choc;

	public ChocolateOrder(Chocolate choc) {			
		this.choc = choc;
	}

	public int getAmount(int amount) {
		return amount;
	}

	public Chocolate getChoc() {
		return this.choc;
	}

}