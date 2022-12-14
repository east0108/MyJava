package tw.brad.myjava;


import java.io.FileInputStream;

public class Brad49 {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
		fin = new FileInputStream("dir1/file1.txt");
		int len ;byte []  buf = new byte[3];//一次三個byte放入陣列，代表UTF-8的中文以3個byte為主 
		while ((len = fin.read(buf))!= -1) {
			System.out.print(new String(buf,0, len));
			
		}
		
		fin.close();
		System.out.println("OK");
		}catch (Exception fe) {
			System.out.println("XX");
		}
//		}catch (FileNotFoundException fe) {
//			System.out.println("XX");
//		}catch (IOException fe) {
//			System.out.println("XX");
		
	}

}