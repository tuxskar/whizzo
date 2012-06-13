package Client_Server.Views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Client_Server.Controllers.ClientController;

public class ClientView {
	ClientController controller;
	
	public ClientView(ClientController con){
		controller = con;
	}
	
	public String inputIp(){
	      System.out.println("Enter IP server (127.0.0.1): ");
	      //  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      String ip = null;
	      try {
	         ip = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your name!");
	         System.exit(1);
	      }
		return ip;
	}
	
	public String customer_name(){
		System.out.print("Enter the customer name: ");
	      //  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      String userName = null;
	      try {
	         userName = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your name!");
	         System.exit(1);
	      }
		return userName;
	}
	
	public void displayError(String str){
		System.out.println(str);
	}
}
