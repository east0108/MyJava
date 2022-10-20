package tw.brad.myjava;

public class Brad15 {

	public static void main(String[] args) {
		int a = 30;
		final int b = 3; //加上final,由變數轉常數
		switch (a) {  // byte, shirt, int, char, String, enum
			default:
				System.out.println("X");
				//break;
			
			case b:
				System.out.println("A");
				//break;
			case 10:
				System.out.println("B");
				//break;  
			
			case 1000:
				System.out.println("C");
				//break;
			
		}
		System.out.println("End");

	}

}
