import java.util.*;

public class Euclidgozyo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b,n,m;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("二つの整数を入力してください。");
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		m = a;
		n = b;
		
		while(m != n) {
			
			if(m > n) {
				m = m - n;
			} else {
				n = n - m;
				
			}
		}
		System.out.println("最大公約数 = " + m);
	}

}
