import java.util.*;

public class daikeisekibun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int k;
		double a,b,n,h,x,s,sum;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("積分区間A,B ?");
		a = stdIn.nextDouble();
		b = stdIn.nextDouble();
		
		n = 50;	//分割数
		h = (b - a) / n;
		x = a;
		s = 0;
		for( k =1; k <= n-1; k++) {
			x = x + h;
			s = s + function(x);
		}
		
		sum = h * ( ((function(a) + function(b)) / 2) + s );
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
