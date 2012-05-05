package Machine;

import ChocolateOrder;
import DateTime;
import List;
import MACHINETYPE;
import Product;
import Stack;

public interface Machine {
	public MACHINETYPE type;
	public List<Product> products;
	public Stack<ChocolateOrder> queue;

	public Machine() {
		
	}

	public void machine (MACHINETYPE type) {
		
	}

	public MACHINETYPE getType () {
		
	}

	public void addChocOrder (ChocolateOrder choc) {
		
	}

	/** Finalitation date */
	public static DateTime finishtAt () {
		
	}

}
