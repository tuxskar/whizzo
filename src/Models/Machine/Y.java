package Models.Machine;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import Models.Chocolate.CHOCOLATETYPE;
import Models.Order.ChocolateOrder;

public class Y implements Machine {
	public static MACHINETYPE type = null;
	public List<Product> products = null;
	public Stack<ChocolateOrder> queue = null;
	
	public void machine () {
		type = MACHINETYPE.Y;
		products = new LinkedList<Product>();
		Product crunchy = new Product(CHOCOLATETYPE.CrunchyFrog,4);
		products.add(crunchy);
		Product spring = new Product(CHOCOLATETYPE.SpringSurprise,10);
		products.add(spring);
		Product ram = new Product(CHOCOLATETYPE.RamBladerCup,18);
		products.add(ram);
		queue = new Stack<ChocolateOrder>();
	}

	public MACHINETYPE getType () {
		return type;
	}

	@Override
	public void addChocOrder(ChocolateOrder choc) {
		queue.add(choc);
	}

	@Override
	public Date finishtAt() {
		return null;
	}

}

