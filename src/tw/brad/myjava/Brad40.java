package tw.brad.myjava;

import java.util.LinkedList;
//LinkedList 有順序性，且會經常異動元素時使用
public class Brad40 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add(0,"A");
		list.add(0,"B");
		list.add(0,"C");
		list.add(0,"D");
		list.add(0,"E");
		for(String v : list) {
			System.out.println(v);
		}
		System.out.println("----------");
	
		
		

	}

}
