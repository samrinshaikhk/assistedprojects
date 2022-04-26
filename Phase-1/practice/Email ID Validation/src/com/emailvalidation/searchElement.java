package com.emailvalidation;
import java.util.ArrayList;

public class searchElement {

	public static void main(String[]args) {
		ArrayList<String> emailID = new ArrayList<String>();

		emailID.add("simon.hasler@gmx.com");
		emailID.add("leonie.klein@gmx.com");
		emailID.add("lea.hoch@gmx.com");
		emailID.add("max,neumann@gmx.com");
		emailID.add("laura.kramm@gmx.com");
		emailID.add("sabine.neuwirth@gmx.com");

		String searchElement = "simon.hasler@gmx.com";
		for(int i =0; i<emailID.size(); i++) {
			System.out.println(emailID.get(i));
			if(searchElement==emailID.get(i)) 
			{
				System.out.println("\n");
				System.out.println("email ID" + searchElement +"found" );
				
				break;
	}
}
}
}
