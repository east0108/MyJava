package tw.brad.myjava;

public class Brad41 {

	public static void main(String[] args) {
		 int a = 10 , b =3;
		 Integer c = a + b; // 將a封裝(autoboxing)到物件C內
		 System.out.println(c.intValue());
		 int d = c - b;//將c解封裝(unboxing)進行運算
		 System.out.println(d);

	}

}
