package tw.brad.myjava;

public class Brad37 {

	public static void main(String[] args) {
		RectShape s1 = new RectShape();
		s1.w1 = 10; s1.w2= 20;
		CircleShap s2 = new CircleShap();
		s2.r = 3;
		viewShape(s1);
		viewShape(s2);

	}
	static void viewShape(Shape s) {
		System.out.printf("Length: %f; Area: %f\n",s.length(),s.area());
	}
}

interface Shape{
	double length();
	double area();
}

class RectShape implements Shape {
	double w1, w2;
	public double length() {return (w1+w2)*2;}
	public double area() {return w1*w2;}
	
}

class CircleShap implements Shape{
	double r;
	public double length() {return r*2*3.14;}
	public double area() {return r*r*3.14;}
}