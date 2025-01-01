package MessageApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket server = new DatagramSocket(4001);  // Port number
		
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length );

		server.receive(packet);
		
		String response = new String(packet.getData());
		
		System.out.println("Received Data : " + response );
		
		server.close();

	}

}