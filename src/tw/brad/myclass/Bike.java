package tw.brad.myclass;

public class Bike extends Object{//預設會繼承Object
	protected	double speed; //protected 父子類別可使用，相同的package
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	public double getSeed() {
		return speed;
	}
	@Override
	public String toString() {
			return "Bike:"+ speed;
	}
}
