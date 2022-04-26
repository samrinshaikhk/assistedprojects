package com.collectionframework;
import java.util.LinkedList;
@SuppressWarnings("unused")
public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<>();

		data.add("Rima");
		data.add("Rohan");
		data.add("Suyog");
		
	

		for (String d : data) {
			System.out.println(d);
		}
	

	}

}
