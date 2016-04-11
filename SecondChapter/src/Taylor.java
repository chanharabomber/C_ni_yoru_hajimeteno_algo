
public class Taylor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double x = 1e-08;
		System.out.println("x	myexp(x)	exp(x)");
		
		for(x = 0; x <= 40; x = x +10)
			System.out.println("" + x + "	" + myexp(x) + "	" + Math.exp(x));
		
	}

	public static double myexp(double x) {
		double EPS = 1e-8;
		double s  = 1.0;
		double e = 1.0;
		double d;
		
		for(int k = 1; k <= 200; k++) {
			d = s;
			e = e * x / k;
			s = s + e;
			if(Math.abs(s - d) < EPS * Math.abs(d)) 
				return s;
		}
		return 0;
	}
}
