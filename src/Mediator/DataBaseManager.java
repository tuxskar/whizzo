package Mediator;

import Models.Chocolate.Chocolate;
import Models.Customer.Customer;
import Models.Machine.Machine;
import Models.Order.Order;

public class DataBaseManager {
	private DataBaseManager instance = null;
	String DBName = "whizzo.db";
	
	private DataBaseManager(){
		//Create database named DBName
	}
	
	public DataBaseManager getInstance(){
		if (instance == null) {
			instance = new DataBaseManager();
		}
		return instance;
	}
	
	public void insertChocolate(Chocolate choc){ }
	public void deleteChocolate(Chocolate choc){ }
	public void insertOrder(Order order){ }
	public void deleteOrder(Order order){ }
	public void insertCustomer(Customer cus){ }
	public void deleteCustomer(Customer cus){ }
	public void insertMachine(Machine machine){ }
	public void deleteMachine(Machine machine){ }
	
}
