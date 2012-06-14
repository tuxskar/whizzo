package Client_Server.Controllers;

import static Client_Server.C_SCommon.SERVICE_NAME;

import java.rmi.Naming;
import Client_Server.C_SCommon;
import Client_Server.Views.ClientView;

public class ClientController {
	ClientView view;
	
	C_SCommon server;
	
	public void begin( ClientView view )
	{
		this.view = view;
		
		try {
//			Registry registry = LocateRegistry.getRegistry(SERVICE_NAME, 1099); 
//			C_SCommon stub = (C_SCommon) registry.lookup(SERVICE_NAME);
			String ip = view.inputIp();
			ip = "127.0.0.1";
			String url = "rmi://" + ip + "/" + SERVICE_NAME;
			
			server = (C_SCommon) Naming.lookup( url );
//			
//			String username = view.customer_name();
//			Customer cus = new Customer(username);
//			server.customer_logged(cus);
			
		} catch( Exception ex ) {
			ex.printStackTrace();
			view.displayError( "Trouble in server communication stopped in begin clientController" );
			System.exit( 1 );
		}
	}
}
