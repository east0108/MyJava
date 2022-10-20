package tw.brad.myjava;
//作弊版 骰骰子陣列
public class Brad21 {

	public static void main(String[] args) {
		int[] p = new int[7];

		for (int i = 0; i < 1000000; i++) {
			int point = (int) (Math.random() * 9) + 1; // 1 - 9
			p[point<=6 ? point : point -3]++; // 判斷式 ?  為ture 執行此敘述 : 為flase 執行此敘述 
		}
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}

	}

}
