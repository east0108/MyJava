package tw.brad.myjava;

import tw.brad.myclass.BCrypt;

public class Brad79 {

	public static void main(String[] args) {
		String hash = "$2a$10$A6U7qkp/i8JRDtQir3S1juKhRkyPH2HSmSYFRjYU8j7c3gw2UVC6e";
		String passwd = "1234567";
		
		if (BCrypt.checkpw(passwd, hash)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}

	}

}
