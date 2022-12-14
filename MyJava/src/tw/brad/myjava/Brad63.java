package tw.brad.myjava;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad63 {
//伺服器端等待
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Listen----------");
			Socket socket   = server.accept();
			
			InputStream in = socket.getInputStream();
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
				
			}
			
			in.close();
			server.close();
			
			String ip =  socket.getInetAddress().getHostAddress();
			
			System.out.println("Server OK"+ ip);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
