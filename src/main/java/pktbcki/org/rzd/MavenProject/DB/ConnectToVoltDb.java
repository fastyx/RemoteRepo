package pktbcki.org.rzd.MavenProject.DB;

import java.io.IOException;

import org.voltdb.client.Client;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.ClientFactory;
import org.voltdb.client.NoConnectionsException;
import org.voltdb.client.ProcCallException;

public class ConnectToVoltDb {
	
	protected Client client;
	protected ClientConfig config; 
	
	public Client ConnectToDB (String login, String password, String IpAddress, int Port)	
			throws NoConnectionsException, IOException{
		try{
			config = new ClientConfig(login,password);
			client=ClientFactory.createClient(config);
			client.createConnection(IpAddress,Port);
			return client;		
		} catch (IOException e){
			e.printStackTrace();
			return null;
		}
	}			
}
