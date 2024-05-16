package Bai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public Client() throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",1234);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while(true) {
			System.out.println(in.read());
		}
	}
	public static void main(String[] args) throws IOException {
		new Client();
	}
}
