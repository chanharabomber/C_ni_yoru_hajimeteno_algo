import java.util.ArrayList;
import java.util.Scanner;


public class tikuzikensakuhoubanhei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		name.add("Ann");
		name.add("Rolla");
		name.add("Nancy");
		name.add("Elusa");
		name.add("Juliet");
		name.add("Machina");
		name.add("Emy");
		name.add("Candyy");
		name.add("Ema");
		name.add("Mari");
		
		age.add(18);
		age.add(19);
		age.add(16);
		age.add(17);
		age.add(18);
		age.add(20);
		age.add(15);
		age.add(16);
		age.add(17);
		age.add(18);
		
		
		int N = name.size();
		int i;
		System.out.print("検索したいのは?");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();

		//番兵 これが最後にあるのでもし検索したい文字がなかったとしても
		//最後のこのkeyto同じ文字を参照し止まるので配列を超えて検索することは無い
		name.add(key);	
		
		i=0;
		for(i=0;i<N;i++) {
			if(name.get(i).equals(key))
				break;
		}

			if(i<N)
				System.out.println(" " + name.get(i) + " " + age.get(i) );
			else
				System.out.println("NO FOUND");

	}

}
