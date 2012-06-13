package Client_Server.Loaders;

import Client_Server.Controllers.ClientController;
import Client_Server.Views.ClientView;


public class WhizzoClient {
	public static void main( String[] args )
	{
		new WhizzoClient().run();
	}
	
	private void run()
	{
		try {
			ClientController controller = new ClientController();
			ClientView view = new ClientView( controller );
		
			controller.begin( view );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
