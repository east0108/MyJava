package tw.brad.myjava;

public class Brad29 {

	public static void main(String[] args) {
		int a=10 , b=3;
		int num = 0;
		num=b;
		b=a;
		a=num;
		System.out.printf("a = %d, b = %d\n",a,b);
		
		int c=5, g=10;
		c = c+g;
		g = c-g;
		c = g-c;
		System.out.printf("c = %d, g = %d",c,g);
		
	}

}
