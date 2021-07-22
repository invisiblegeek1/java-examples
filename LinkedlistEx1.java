package com.example1;

import java.util.LinkedList;

public class app {
	public static void main(String[] args) {
		LinkedList<String> ls= new LinkedList<>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");
		int n=ls.size();

		
		for(int i=n-1;i>=0;i--) {
			System.out.println(ls.get(i));
			
		}
	}


}
