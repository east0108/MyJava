package tw.brad.myjava;



public class PokerV3 {

	public static void main(String[] args) {
		int nums = 52;
		int [] poker = new int [nums];
		
		//52張牌
		for(int i=0;i<nums;i++) poker[i]=i;
		//洗牌
		for(int i = nums - 1;i > 0;i--) {
			int rand = (int)(Math.random() * (i+1));
			//pokerp[rand] <-> poker[i]
			int temp =poker[rand];
			poker[rand]=poker[i];
			poker[i]=temp;
		}
		for(int card : poker) {
			System.out.println(card);
		}
		
		
	}

}
