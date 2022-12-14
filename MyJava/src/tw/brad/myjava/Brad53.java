package tw.brad.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad53 {

	public static void main(String[] args) {
		String source = "dir1/office.jpg";
		String target = "dir2/office2.jpg";
		long start = System.currentTimeMillis();
		try {
		FileOutputStream fout = new FileOutputStream(target); 
		FileInputStream fin  = new FileInputStream(source);
		byte len; byte[] buf = new byte[4*1024];
		while ((len = (byte) fin.read(buf)) != -1) {
			fout.write(buf,0,len );
		
		}
		
		fin.close();
		
		fout.flush();
		fout.close();
		
		System.out.println("Save as ...ok" + (System.currentTimeMillis()- start));
		
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}