package alist;

import List.AList;

public class Main {

	public static void main(String[] args) {
		AList aa = new AList();
		aa.addEnd(45);
		aa.addEnd(42);
		aa.addEnd(55);
		aa.addEnd(66);
		aa.addEnd(78);
		aa.addEnd(77);
		System.out.println(aa);
		aa.sort();
		System.out.println(aa);
		aa.clear();
		System.out.println(aa);
		
	}

}
