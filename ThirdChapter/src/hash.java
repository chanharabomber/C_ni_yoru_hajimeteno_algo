import java.util.HashMap;
import java.util.Scanner;


public class hash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 Scanner stdIn = new Scanner(System.in);
		int n;

		String name = new String();
		String telnum = new String();
		
		System.out.println("name, tellphone number:");
		name = stdIn.next();
		while(name != null) {
		*/
		
		Scanner stdIn = new Scanner(System.in);
		String key = new String();
		HashMap<String,String> map = new HashMap<String,String>();

		map.put("SUZUKI", "111-333888");
		map.put("KAWADA", "3141-34343");
		map.put("SIMADA", "11441-33356");
		map.put("KIKUTCI", "114341-333677");
		
		System.out.println("検索するkeyを入力してください:");
		key = stdIn.next();
		if(map.containsKey(key)) {
			System.out.println(" " + key + " " + map.get(key)) ;
		
		} else {
			System.out.println(" no found ") ;
		}
		
		
	}

}
