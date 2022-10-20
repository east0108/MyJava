package tw.brad.myclass;

public class TWid {//static 與物件無關，所以無法呼叫
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	//建構式的overload
	public TWid() {
		this((int)(Math.random()*2)==0);
	}
	public TWid(boolean isMale) {
		this(isMale,(int)(Math.random()*26));
	}
	
	public TWid(int area) {
		this((int)(Math.random()*2)==0, area);
	}
	
	public TWid(boolean isMale, int area) {
		StringBuffer sb  =new StringBuffer();
		sb.append(letters.substring(area, area+1))
			.append(isMale? 1 : 2)
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10))
			.append((int)(Math.random()*10));
		String temp = sb.toString();
		for(int i=0;i<10;i++) {
			if(isValidTWid( temp + i)) {
				id = temp + i;
			}
			
		}
		
		
		
	} 
	
	public String getId() {
		return id;
	}

	public boolean isMale() {
		return true;
	}

	private TWid(String id) {
		this.id = id;
	}
	
	public static TWid craeaTWid(String id) {
		TWid temp =null;
		if(isValidTWid(id)) {
			temp = new TWid(id);
		}
		return temp;
	}
	
	
	
	
	public static boolean isValidTWid(String id) {
		//1. 10碼 2.第一個字英文 3.第二字只能是1或2 4.3~10個字只能是數字
		boolean ret = false;
//		方法一
		if(id.matches("[A-Z][1289][0-9]{8}")) {
			
		    letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			char c1 =id.charAt(0);
			int pos = letters.indexOf(c1);// 0-25
			int n12 = pos + 10;//10-35
			int n1= n12/10;
			int n2= n12%10;
//			-----------------
			String s3= id.substring(1, 2);
			int n3 = Integer.parseInt(s3);
			
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			//-------------------------------------------------
			
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4
					+ n8*3 + n9*2 + n10*1 + n11*1;
			ret = sum%10 ==0;
		}
		
		
       //方法二		
//		if(id.length() == 10) {
//			char c1 = id.charAt(0);
////			
////			
////			
//			if(Character.isLetter(c1)) {
//				String c2nds = "1289";
//				String c2nd = id.substring(1, 2);
//				if(c2nds.contains(c2nd)) {
//					String c3nds = "0123456789";
//					String c3nd = id.substring(2, 11);
//					if(c3nds.contains(c3nd) {
//						
//						return true;
//						
//					}
//					
//					return true;
//				}
//			}
//			
//		}
		
		return ret;
	}
}
