package pktbcki.org.rzd.MavenProject.DB;

import java.io.IOException;

import org.voltdb.client.Client;
import org.voltdb.client.NoConnectionsException;
import org.voltdb.client.ProcCallException;

public class CRUDImpl {

	
	public void insert(Client client, String query) throws ProcCallException, NoConnectionsException, IOException {
				
		try{
			client.callProcedure("@AdHoc", query);
		} catch (ProcCallException e){
			e.printStackTrace();
		} catch (NoConnectionsException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}	
			
	}
	
}
