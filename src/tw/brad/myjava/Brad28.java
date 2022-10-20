package tw.brad.myjava;

public class Brad28 {
	
	public static void main(String[] args) {
		Brad283 obj1 = new Brad283();//會呼叫Brad283()所有父類別

	}

}
class Brad281 extends Object{
	public Brad281() {
		System.out.println("Brad281()");
	}
}
class Brad282 extends Brad281{

	Brad282(int a) {//
		System.out.println("Brad282()");
	}
}

class Brad283 extends Brad282{

	Brad283() {//
		super(1);
		System.out.println("Brad283()");
	}
}
//呼叫所有父類別