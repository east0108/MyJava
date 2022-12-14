package tw.brad.myclass;

public class  Scooter extends Bike{//繼承Bike類別
	private int gear; // 初始化 0 屬性
	private int color;
	
	public Scooter() {
		this(2);//使用建構式Scooter(int color)
	}
	
	public Scooter(int color) {//建構式:與物件名稱相同，對物件初始化 定義物件長相
		this.color = color;
	}// java所有類別都有建構式，使用Object的建構式，編譯器做的，與繼承無關 
	
	
	
	
	public void upSpeed() { //方法
		speed = speed < 1 ? 1 : speed + speed*gear;
	}
	
	public void upSpeed(boolean isTurbo) {//負載 overload
		if(isTurbo) {
			speed = speed < 1 ? 1 : speed + speed*gear*1.2;
		}else{
			upSpeed();
		}
	}
	
	public int changeGear(int gear) {
		if(gear>=0 && gear <=5) {
		this.gear = gear;
		}
		
		return this.gear;
	}
	public int getGear() {
		return gear;
	}
	
	
	
	
}