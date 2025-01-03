package ThreadsChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Chat_client {

	static int PORT = 4001;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("\t\t Simple Chat Client");
		System.out.println("\t\t ==================");
		
		Scanner scannerInput = new Scanner(System.in);
		String input,output;
		
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		
		
		Socket socket = new Socket(ipAddress, PORT);

		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // meassage from the server is in the (in)

		try {
			while(true) {
				input = in.readLine();
				System.out.println("Server says : "+ input);
				
				System.out.println("Client : ");
				output = scannerInput.nextLine();
				out.println(output);
				
			}
		}
		finally {
			out.close();
			in.close();
			socket.close();
		}
		
		
		
	}

}