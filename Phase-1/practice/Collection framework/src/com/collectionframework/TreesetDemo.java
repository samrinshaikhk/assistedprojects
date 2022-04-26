package com.collectionframework;

import java.util.TreeSet;
@SuppressWarnings("unused")
public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> data = new TreeSet<>();
		data.add("Zalak");
		data.add("Amit");
		data.add("Sumit");
		data.add("Supriya");

		for (String d : data) {
			System.out.println(d);
		}

	
	}

}
