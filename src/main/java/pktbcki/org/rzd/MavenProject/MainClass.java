package pktbcki.org.rzd.MavenProject;

import java.io.IOException;

import org.voltdb.client.Client;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.NoConnectionsException;
import org.voltdb.client.ProcCallException;

import pktbcki.org.rzd.MavenProject.DB.CRUDImpl;
import pktbcki.org.rzd.MavenProject.DB.Connector;

public class MainClass {

	public static void main(String[] args) throws NoConnectionsException, IOException, ProcCallException {
	
		Client client = null;
		ClientConfig config = null;
		
		
		
		Connector connDb	=	new Connector();
		
		if((client=connDb.ConnectToDB(client,config,"admin","admin","192.168.122.129",21212)) != null)
		{
			System.out.println("Connection Success!!!");
		}
		else
			System.out.println("Connection faild!!!");
		
		CRUDImpl crud = new CRUDImpl();
		crud.insert(client, "insert into MUSIC values ('Placebo','noname',1999)");	
	}
}
