package tw.brad.myjava;

public class Brad34 {

	public static void main(String[] args) {
//		Brad341 obj1 = new Brad341();
		Brad341 obj1 = new Brad342();
		Brad342 obj2 = new Brad342();
	
	}

	
	
}

abstract class Brad341{
	void m1() {System.out.println("Brad341:m1()");}
	abstract void m2(int a);
	abstract  public Object m3(Object s);
	abstract void m4();
}
class Brad342 extends Brad341{
	void m2(int b) {}
	void m2() {}
	public String m3(Object d) {return null;}
	void m4() {} 
}

//class Brad343 extends Brad341{
//	void m2(int c) {}
//	void m3() {}
//	void m4() {} 
//}
