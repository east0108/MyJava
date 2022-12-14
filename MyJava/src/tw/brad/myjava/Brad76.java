package tw.brad.myjava;

public class Brad76 {
	private static final int DIR_SOP =  0;
	private static final int DIR_LEFT = 1;
	private static final int DIR_RIGHT = 2;
	private static final int DIR_UP = 3;
	private static final int DIR_DOWN = 4;
	
	public static void main(String[] args) {
		int dir  = DIR_SOP;
		dir = DIR_LEFT;
		dir = 123;
		
		

	}

}


//列舉

enum Dir {
	STOP,UP,DOWN,LEFT,RIGHT;
}