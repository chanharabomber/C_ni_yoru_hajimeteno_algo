import java.util.*;

public class Euclidgozyo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b,m,n,k;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("二つの整数を入力してください。");
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		m = a;
		n = b;
		//System.out.println("m % n = " + (m % n) + "n % m =  " + (n % m) );
		
		do {
			//System.out.println("m,n=" + m + "    " + n);
			k = m % n;
			m = n;
			n = k;
			//System.out.println("k= " + k  + " m,n=" + m + "  " + n);
		} while(k != 0);

		System.out.println("最大公約数 = " + m);
		
	}

}
