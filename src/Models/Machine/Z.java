package Models.Machine;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import Models.Chocolate.CHOCOLATETYPE;
import Models.Order.ChocolateOrder;

public class Z implements Machine {
	public static MACHINETYPE type = null;
	public List<Product> products = null;
	public Stack<ChocolateOrder> queue = null;

	public void machine () {
		type = MACHINETYPE.Z;
		products = new LinkedList<Product>();
		Product ram = new Product(CHOCOLATETYPE.RamBladerCup,18);
		products.add(ram);
		queue = new Stack<ChocolateOrder>();
	}

	public MACHINETYPE getType () {
		return type;
	}

	public void addChocOrder (ChocolateOrder choc) {
		queue.add(choc);
	}

	public Date finishtAt() {
		return null;
	}

}
