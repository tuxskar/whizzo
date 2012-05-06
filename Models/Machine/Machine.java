package Machine;

import java.util.*;
import java.io.*;
import Order.ChocolateOrder;

enum MACHINETYPE {X, Y, Z};

public interface Machine {
	public MACHINETYPE type;
	public List<Product> products;
	public Stack<Order.ChocolateOrder> queue;

	public Machine() {
		
	}

	public void machine(MACHINETYPE type) {
		
	}

	public MACHINETYPE getType() {
		
	}

	public void addChocOrder(ChocolateOrder choc) {
		
	}

	/** Finalitation date */
	public static Date finishtAt() {
		
	}

}
