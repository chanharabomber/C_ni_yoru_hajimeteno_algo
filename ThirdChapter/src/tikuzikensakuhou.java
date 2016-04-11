import java.util.*;

public class tikuzikensakuhou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//string[][]でも可能?
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
