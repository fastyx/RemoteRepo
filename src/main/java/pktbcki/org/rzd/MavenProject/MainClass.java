package pktbcki.org.rzd.MavenProject;

import java.io.IOException;

import org.voltdb.client.Client;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.NoConnectionsException;
import org.voltdb.client.ProcCallException;

import pktbcki.org.rzd.MavenProject.DB.CRUD;
import pktbcki.org.rzd.MavenProject.DB.ConnectToVoltDb;

public class MainClass {

	public static void main(String[] args) throws NoConnectionsException, IOException, ProcCallException {
		
		CRUD connOne	=	new CRUD();			
		if((connOne.ConnectToDB("admin","admin","192.168.122.129",21212)) != null)
		{
			System.out.println("Connection Success!!!");
		}
		else
			System.out.println("Connection faild!!!");
		
		
		connOne.insert("insert into MUSIC values ('Placebo','noname',1999)");
	}
}
