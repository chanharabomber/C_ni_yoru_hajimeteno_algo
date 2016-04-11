import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class mojiretuokikaeReplace {

	/**
	 * @param args
	 */
	
	
	/*
	public static String replace(String txt,String pattern) {
		
		int t_len = txt.length();
		int p_len = pattern.length();
		
		Matcher m = Pattern.compile(pattern).matcher(txt);
		if (m.find()){
		    
			System.out.println("\"" + pattern + "\" is found in \"" + txt + "\".");
		    
		    
		} else {
		    System.out.println("\"" + pattern + "\" is not found in \"" + txt + "\".");
		}
		
		
	}
	*/
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String text = "this is a pen. that is a pencil.";
		String pt = "cap";
		text = text.replaceAll("pen", pt);
		System.out.println(text);
	}

}
