package Customer;

import java.util.Date;
import java.util.List;

import Order.Order;

public class Customer {
	public String name;
	public String contact;
	public String address;
	public List<Order> orders;
	public int ID;
	public int total;

	public Customer() {
		
	}

	public Customer (String name, String contact, String address, int ID) {
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.ID = ID;
	}

	public void addOrder(Order order) {
		orders.add(order);
		total++;
	}

	public void deleteOrder (Date date) {
		orders.remove(date);
		total--;
	}

}