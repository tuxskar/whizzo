package Client_Server.Loaders;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import Client_Server.C_SCommon;
import Client_Server.Controllers.ServerController;
import Client_Server.Views.ServerView;


public class WhizzoServer {
	public static void main( String[] args )
	{
		new WhizzoServer().run();
	}
	
	private void run()
	{
		try {
			LocateRegistry.createRegistry( 1099 );
			
			ServerController controller = new ServerController();
			ServerView view = new ServerView( controller );
		
			controller.begin( view );
		
			Naming.rebind( C_SCommon.SERVICE_NAME, controller );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
