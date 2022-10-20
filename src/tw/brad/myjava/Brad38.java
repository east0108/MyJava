package tw.brad.myjava;

import java.util.HashSet;

public class Brad38 {

	public static void main(String[] args) {
		// 迭代器 iterator , iterable 可迭代
		// set : 1. 元素不會重複 2. 沒有順序性
		// list: 1. 元素可以重複 3. 有順序性
		
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(new String("Brad"));
		set.add("Brad");
		set.add(123); // int => autoboxing => Integer Object
		set.add(12.3);// double => autoboxing => Double Object
		set.add("iSpan");
		System.out.println(set.size());
		System.out.println(set);
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
	
		
	}

}
