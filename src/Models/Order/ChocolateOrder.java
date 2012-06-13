package Models.Order;

import Models.Chocolate.Chocolate;

public class ChocolateOrder {
	public int amount;
	public Chocolate choc;

	public ChocolateOrder(Chocolate choc) {			
		this.choc = choc;
	}

	public int getAmount() {
		return amount;
	}

	public Chocolate getChoc() {
		return choc;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setChoc(Chocolate choc) {
		this.choc = choc;
	}

	@Override
	public String toString() {
		return "ChocolateOrder [amount=" + amount + ", choc=" + choc + "]";
	}

}