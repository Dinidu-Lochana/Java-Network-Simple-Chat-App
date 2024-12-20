package MessageApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	static int port = 3999;
	
	public static void main(String[] args) throws IOException {
		System.out.println("\t\t Simple Server");
		System.out.println("\t\t ==============");

		ServerSocket serversocket = new ServerSocket(port);
		
		try {
			while(true) {
					Socket socket = serversocket.accept();
					System.out.println("Client is Connected...\n\n");
					
				try {

					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
					out.println("Welcome to socket Programming.....");
				}
				finally {
					socket.close();
				}
				
			}
		}
		finally {
			serversocket.close();
		}
	}

}