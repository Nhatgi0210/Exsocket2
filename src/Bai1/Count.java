package Bai1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Count extends Thread{
	Socket socket;
	
	public Count(Socket socket) {
		super();
		this.socket = socket;
	}


	public void run() {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 1000) {
				try {
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				out.write(i);
				i++;
				this.sleep(100);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
