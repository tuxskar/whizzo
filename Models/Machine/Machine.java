package Machine;

import java.util.Date;
import java.util.List;
import java.util.Stack;

import Order.ChocolateOrder;

enum MACHINETYPE {X, Y, Z};

public interface Machine {
	MACHINETYPE type = MACHINETYPE.X;
	List<Product> products;
	Stack<Order.ChocolateOrder> queue;

	public Machine() {
		
	}

	public void machine(MACHINETYPE type);

	public MACHINETYPE getType(MACHINETYPE type);

	public void addChocOrder(ChocolateOrder choc);

	public static Date finishtAt();

}
