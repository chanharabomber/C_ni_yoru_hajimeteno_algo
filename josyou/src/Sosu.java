import java.util.*;
public class Sosu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i,n;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を入力してください。");
		n = stdIn.nextInt();
		
		for(i = (int) Math.sqrt(n); i > 1; i--) {
			System.out.println("" + i);
			if(n % i == 0)
				break;
		}
		if((i == 1) && (n != 1))
			System.out.println("素数");
		else
			System.out.println("素数でない");
	}

}
