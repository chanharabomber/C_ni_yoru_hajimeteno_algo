//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import java.util.regex.*;


public class patterrnMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String value = "This is a pencil.";
		String pattern = "pen";
		Matcher m = Pattern.compile(pattern).matcher(value);
		if (m.find()){
		    System.out.println("\"" + pattern + "\" is found in \"" + value + "\".");
		} else {
		    System.out.println("\"" + pattern + "\" is not found in \"" + value + "\".");
		}
	}

}
