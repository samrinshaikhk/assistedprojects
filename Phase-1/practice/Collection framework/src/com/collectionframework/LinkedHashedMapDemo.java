package com.collectionframework;
import java.util.LinkedHashMap;
import java.util.Set;

@SuppressWarnings("unused")
public class LinkedHashedMapDemo {

	public static void main(String[] args) {
		

			LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
			linkedHashMap.put("first", "Zalak");
			linkedHashMap.put("second", "Amit");
			linkedHashMap.put("third", "Subham");

			//Ctrl + Shift + O
			Set<String> keys = linkedHashMap.keySet();
			for(String key : keys) {
				System.out.println(key);
		
	}

}
}