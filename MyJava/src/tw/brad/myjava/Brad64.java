package tw.brad.myjava;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad64 {
//客戶端發送
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),7777);//發送目標IP
			OutputStream out = socket.getOutputStream();
			out.write("Hello, Brad".getBytes());
			out.flush();
			out.close();
			System.out.println("Client OK");
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

}
