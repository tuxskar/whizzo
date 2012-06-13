package Client_Server.Views;

import java.io.IOException;

import Client_Server.Controllers.ServerController;
import Models.Customer.Customer;

public class ServerView {
	private ServerController controller;
	private String ip;
	
	public ServerView(ServerController controller){
		this.controller = controller;
	}
	
	public void displayIP(String ip) {
		System.out.println("IP = " + ip);
		this.ip = ip;
	}

	public void logged_customer(Customer customer) {
		System.out.println("The customer " + customer.toString()
				+ " has been logged in the system");
	}
	
	public void server_Started(){
		System.out.println("The server has been started in the IP: "
				+ ip);
	}
	
	public void show_menu() throws IOException{
		System.out.println(
				"Whizzo Server side, you can press:\n" +
				"A: See all the Customers already connected\n" +
				"Q: Exit from the system");
		char op = (char)System.in.read();
		switch (op){
			case 'A' : 
			break;
			case 'Q' : controller.end_server();
			break;
		}		
	}
	
	
}
