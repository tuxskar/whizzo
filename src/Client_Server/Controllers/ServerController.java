package Client_Server.Controllers;

import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import Client_Server.C_SCommon;
import Client_Server.Views.ServerView;
import Models.Customer.Customer;
import Models.Machine.Machine;
import Models.Order.Order;

public class ServerController extends UnicastRemoteObject implements C_SCommon {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int MAXCLIENTS = 5;
	// This number is the maximum clients connected at the same time
	private int no_clients = MAXCLIENTS;
	private List<Customer> customers;
	private ServerView view;

	public ServerController() throws RemoteException {
		customers = new ArrayList<Customer>(MAXCLIENTS);
	}

	@Override
	public synchronized void customer_logged(Customer customer)
			throws RemoteException {
		while (no_clients == 0)
			try {
				wait();
			} catch (Exception ex) {
			}

		customers.add(customer);
		view.logged_customer(customer);
	}

	public void begin(ServerView view) throws Exception {
		// TODO Auto-generated method stub
		this.view = view;
		view.displayIP(InetAddress.getLocalHost().getHostAddress());
		view.server_Started();
		view.show_menu();
	}

	@Override
	public void newCustomer(Customer customer) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void newOrder(Order customer) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void newMachine(Machine customer) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() throws RemoteException {
		// TODO Auto-generated method stub

	}
	
	public void end_server(){
		System.exit(0);
	}

}
