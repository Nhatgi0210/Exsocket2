package Bai1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public Server() throws IOException {
		ServerSocket server = new ServerSocket(1234);
		while(true) {
			Socket socket = server.accept();
			Count count = new Count(socket);
			count.start();
		}
	}
	public static void main(String[] args) throws IOException {
		new Server();
	}
}
