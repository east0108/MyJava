package tw.brad.myjava;

import java.util.Scanner;

public class Brad16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Month = ");
		int month = scanner.nextInt();
		int day ;
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
			default:
				day =0;
		}
		System.out.printf("%d月有%d天", month, day );

	}

}