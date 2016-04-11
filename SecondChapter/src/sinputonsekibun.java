import java.util.Scanner;


public class sinputonsekibun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int k;
		double a,b,n,h,fo,fe,sum;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("積分区間A,B ?");
		a = stdIn.nextDouble();
		b = stdIn.nextDouble();
		
		n = 50;
		h = (b - a) / (2 * n);
		fo = 0;
		fe = 0;
		for(k = 1; k <= 2 * n - 3; k = k + 2) {
			fo = fo + function(a + h*k);
			fe = fe + function(a + h *(k + 1));
		}
		sum = (function(a) + function(b) + 4 *(fo + function(b - h)) + 2 * fe) * h / 3;
		System.out.println("/" + b);
		System.out.println("| sqrt(4-x*x) = " + sum);
		System.out.println("＼" + a);
	}

	public static double function(double x) {
		double y;
		y = Math.sqrt(4 - x * x);
		return y;
	}
	
}
