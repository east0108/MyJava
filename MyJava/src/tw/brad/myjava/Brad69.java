package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Brad69 {

	public static void main(String[] args) {
		
		
		try {
			URL url = new URL("https://thumbs.dreamstime.com/b/white-coffice-cup-top-view-background-painting-etc-171505012.jpg");
			HttpsURLConnection conn;
			conn = (HttpsURLConnection) url.openConnection();
			
			conn.connect();
			BufferedOutputStream bout = 
					new BufferedOutputStream(
							new FileOutputStream("dir1/newcoffiee.jpg"));
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			int len;byte[] buf =new byte[16*1024];
			while ((len = bin.read(buf)) != -1) {
				bout.write(buf,0,len);
				
			}
			
			bin.close();
			bout.flush();
			
			
		} catch (IOException e) {
			
		}
		
		

	}

}
