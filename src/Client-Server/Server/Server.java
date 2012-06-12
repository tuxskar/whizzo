package Server;

import java.rmi.*;
import java.rmi.registry.*;

public class Server {
	
	public static void main( String[] args )
	{
		new Whizzo().run();
	}
	
	
	private void run()
	{
		try {
			LocateRegistry.createRegistry( 1099 );
			
			ServerController controller = new ServerController();
		
			Naming.rebind( SERVICE_NAME, controller );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
}
