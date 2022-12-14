package tw.brad.myjava;

public class Brad75 {

	public static void main(String[] args) {
		Brad741 objA = new Brad741("A");
		Brad741 objB = new Brad741("B");
		Brad741 objC = new Brad741("C");
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		
		objA.setPriority(Thread.MIN_PRIORITY);
		objB.setPriority(Thread.NORM_PRIORITY);
		objC.setPriority(Thread.MAX_PRIORITY);
		//objA.setDaemon(true);//設定為魔鬼執行續。當前景執行續結束，背景執行(魔鬼執行續)續就會被強制結束
		objA.start();
		objB.start();
		objC.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
		}
		System.out.println("main");

	}

}

