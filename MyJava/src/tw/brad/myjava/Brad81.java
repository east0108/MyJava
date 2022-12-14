package tw.brad.myjava;

public class Brad81 {

	public static void main(String[] args) {
		Brad811 ogj = new Brad811();
		ogj.m1(-1);

	}

}

class Brad811{
	void m1(int a) {
		try {
			if(a<0) {
				throw new Exception();
			}
			System.out.println("OK");
			//return;
		} catch (Exception e) {
			System.out.println("XX");
			return;
		}finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}
	
}
