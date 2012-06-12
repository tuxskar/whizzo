package Order;

import java.util.Date;
import java.util.List;

public class Order {
	public Date date;
	public List<ChocolateOrder> chocolates;
	public int total;

	public Order() {
	}

	public Order (Date date) {
		this.date = date;
	}

	public void addChocolate(ChocolateOrder ch) {
		chocolates.add(ch);
	}

}
