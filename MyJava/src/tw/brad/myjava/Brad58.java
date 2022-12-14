package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.management.loading.PrivateClassLoader;

import tw.brad.myclass.Bike;

public class Brad58 {

	public static void main(String[] args) {
		Brad583 obj = new Brad583();
		//序列化:對指定的目標序列化(如果目標物件不存就新建一個)
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(
							new FileOutputStream("dir1/b2.obj"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("----");
		
		//反序列化:將放置在序列的物件屬性傳入目標(如果放入目標不存在，出現FileNotFoundException)
		try {
			ObjectInputStream oin = 
					new ObjectInputStream(
							new FileInputStream("dir1/b3.obj"));
			Object obj2 = oin.readObject();
			oin.close();
			System.out.println("OK2");
		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}

class Brad581 {
	Brad581() {
		System.out.println("Brrad581()");
	}
}
class Brad582 extends Brad581{
	
	 Brad582() {
		System.out.println("Brrad582()");
	}
}
class Brad583 extends Brad582 implements Serializable{
	private Bike bike; 
	 Brad583() {
	
		System.out.println("Brrad583()"); 
		bike = new Bike();
	}
}

