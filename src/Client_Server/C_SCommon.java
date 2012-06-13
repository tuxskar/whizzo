package Client_Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Models.Customer.Customer;
import Models.Machine.Machine;
import Models.Order.Order;

public interface C_SCommon extends Remote {
	public static final String SERVICE_NAME = "smallgame";

	public void start() throws RemoteException; // for admin loggins
	public void customer_logged(Customer customer) throws RemoteException; // for usual user loggins
	public void newCustomer(Customer customer) throws RemoteException;
	public void newOrder(Order customer) throws RemoteException;
	public void newMachine(Machine customer) throws RemoteException;
}
