package tw.brad.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.NonWritableChannelException;
import java.util.Base64;

public class Brad82 {

	public static void main(String[] args) {
		try {
			File file = new File("dir1/office.jpg");
			FileInputStream fin = new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			fin.close();			
			
			byte[] base64 = Base64.getEncoder().encode(buf);
			System.out.println("source byte len"+buf.length);
			System.out.println("BASE64 byte len"+base64.length);
			
			String base64String = new String(base64,"UTF-8");
			System.out.println("str = "+base64String.length()); //data:image/jpg;base64,iv........
			System.out.println(base64String);
			System.out.println("-----------------");
			
			byte[] debase64 = Base64.getDecoder().decode(base64String);
			System.out.println("debase64 byte len = "+ debase64.length);
			FileOutputStream  fout = new FileOutputStream("dir2/office2.jpg");
			fout.write(debase64);
			fout.flush();
			fout.close();
			
			
			
			
			
			
		} catch (Exception e) {
			
		}

	}

}
