package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class RegexDemo {

	public static void main(String[] args) {
		String pattern = ".s";
		String input = "samrin";

		/*
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(input);
		 * 
		 * boolean result = m.matches(); System.out.println(result);
		 */

		System.out.println(Pattern.matches("^(.+)@(.+)$", "samrinsk97@gmail.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.-]+@(.+)$", "samrinsk97@gmail.com"));
		
		System.out.println();

	}

}
