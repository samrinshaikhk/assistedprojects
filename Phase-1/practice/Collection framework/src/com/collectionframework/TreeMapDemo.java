package com.collectionframework;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class TreeMapDemo {

	public static void main(String[] args) {
		
TreeMap<String, String> treeMap = new TreeMap<>();
		
		treeMap.put("second", "Amit");
		treeMap.put("third", "Subham");
		treeMap.put("first", "Zalak");

		//Ctrl + Shift + O
		Set<String> keys = treeMap.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		Collection<String> vals = treeMap.values();
		for(String val : vals) {
			System.out.println(val);
		}
	}
}

