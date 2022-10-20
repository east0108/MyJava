package tw.brad.myjava;

import tw.brad.myclass.Bike;
import tw.brad.myclass.Scooter;

public class Brad25 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		
		System.out.println(b1.getSeed());
		while(b1.getSeed()<=10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSeed());
		System.out.println("---------");
		
		Scooter s1 = new Scooter(5);// new 產生空間 物件初始化
		System.out.println(s1.getSeed() + ":"+s1.getGear());
		s1.changeGear(2);
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSeed());

		s1.changeGear(3);
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSeed());
	}

}
