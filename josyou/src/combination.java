import java.util.*;

public class combination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n,r;
		Scanner stdIn = new Scanner(System.in);

		System.out.println("nCrを計算します。");
		
		System.out.println("nを入力");
		n = stdIn.nextInt();
		
		System.out.println("rを入力");
		r = stdIn.nextInt();
		
		for( int i = 0; i <= n; i++)
			System.out.println("" + n + "C" + i + "=" + combi(n,i));
		
		System.out.println("" + n + "^" + r + "=" + bekijou(n,r));
		System.out.println("" + n + "!=" + kaijou(n));
	}

	public static double bekijou(int n,int r) {
		double p=1;
		for(int i=1;i<=r;i++)
			p = p*n;
		return p;
	}
	
	public static double combi(int n,int r) {
	
		double p=1;
	
		for(int i=1;i<=r;i++) {
			p = p * (n-i+1) / i;
		}
	
	return p;
	}
	
	public static double kaijou(int n){
		double p = 1;
		for(int i = 1;i<=n;i++)
			p = p*i;
		
		return p;
	}
}
