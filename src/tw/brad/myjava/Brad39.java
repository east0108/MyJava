package tw.brad.myjava;

import java.util.HashSet;
import java.util.TreeSet;
//使用陣列:在知道資料元素的情況下使用
//使用資料結構:在不知道資料元素的情況下使用，可以不在意順序性

public class Brad39 {

	public static void main(String[] args) {
		TreeSet<Integer> lotters = new TreeSet<>();//泛型<> 限定資料型態
		while(lotters.size()<6) {
			lotters.add((int)(Math.random()*49+1));
		} 
		System.out.println(lotters);
	}

}
