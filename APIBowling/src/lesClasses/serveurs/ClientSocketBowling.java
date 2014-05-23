package lesClasses.serveurs;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketBowling {

	Socket maSocketClient;
	
	public static void main(String[] args) {
		Socket uneSocket;
		BufferedReader unBufferReader;
		
		try {
			uneSocket = new Socket(InetAddress.getLocalHost(), 2009);
			System.out.println("Demande de connexion");
			
			uneSocket.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
