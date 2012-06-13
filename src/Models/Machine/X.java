package Models.Machine;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import Models.Chocolate.CHOCOLATETYPE;
import Models.Order.ChocolateOrder;


public class X implements Machine {
	public static MACHINETYPE type = null;
	public List<Product> products = null;
	public Stack<ChocolateOrder> queue = null;
	
	public void machine () {
		type = MACHINETYPE.X;
		products = new LinkedList<Product>();
		Product crunchy = new Product(CHOCOLATETYPE.CrunchyFrog,2);
		products.add(crunchy);
		Product spring = new Product(CHOCOLATETYPE.SpringSurprise,7);
		products.add(spring);
		queue = new Stack<ChocolateOrder>();
	}

	public MACHINETYPE getType() {
		return type;
	}
	
	public Date finishtAt() {
		return null;
	}

	@Override
	public void addChocOrder(ChocolateOrder choc) {
		queue.add(choc);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Stack<ChocolateOrder> getQueue() {
		return queue;
	}

	public void setQueue(Stack<ChocolateOrder> queue) {
		this.queue = queue;
	}

	public static void setType(MACHINETYPE type) {
		X.type = type;
	}

	@Override
	public String toString() {
		return "X [products=" + products + ", queue=" + queue + "]";
	}


}
