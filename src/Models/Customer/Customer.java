package Models.Customer;

import java.util.Date;
import java.util.List;

import Models.Order.Order;

public class Customer {
	public String name;
	public String contact;
	public String address;
	public List<Order> orders;
	public int ID;
	public int total;

	public Customer(String name){
		this.name = name;
		this.contact = null;
		this.address = null;
		this.orders = null;
		this.ID = 0;
		this.total = 0;
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

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public int getID() {
		return ID;
	}

	public int getTotal() {
		return total;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address="
				+ address + ", orders=" + orders + ", ID=" + ID + ", total="
				+ total + "]";
	}

}