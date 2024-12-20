package MessageApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClient2 {
static int PORT = 7999;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t Simple Client2");
		System.out.println("\t\t =============");
		
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		Socket socket = new Socket(ipAddress, PORT);
		System.out.println("Server is Connected.......\n\n");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //meassage from the server is in the (in)

		String input = in.readLine();
		
		System.out.println("Server says : " + input);
		
		System.out.println("Closing the connection...");
		socket.close();
		in.close();
		
		System.exit(0);
	}

}
