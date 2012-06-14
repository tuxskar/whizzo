package Mediator;

import java.util.Date;
import java.util.List;

import Models.Chocolate.CHOCOLATETYPE;
import Models.Chocolate.Chocolate;
import Models.Machine.MACHINETYPE;
import Models.Machine.Product;
import Models.Order.Order;

public class ModelManager {
	public void newOrder(Date date){ }
	public void deleteOrder(Date date){ }
	public void newChocolateOrder(Chocolate choc, int amount){ }
	public void deleteChocolateOrder(Order order, Chocolate choc){ }
	public void modifyChocolateOrder(Order order, Chocolate choc, int amount){ }
	
	public void newMachine(MACHINETYPE type, List<Product> products){ }
	public void modifyMachine(MACHINETYPE type, Product product){ }
	public void deleteMachine(MACHINETYPE type){ }
	public void newProduct(CHOCOLATETYPE type, int productime){ }
	
	public void newChocolate(CHOCOLATETYPE type){ }
	public void modifyChocolate(CHOCOLATETYPE type, int value){ }
	public void deleteChocolate(CHOCOLATETYPE type){ }
	
	public void newCustomer(String name, String contact, String address, int ID){ }
	public void deleteCustomer(int ID){ }
	public void modifyCustomer(String name, String contact, String address, int ID){ }
}
