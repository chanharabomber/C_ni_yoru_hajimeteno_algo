
public class TaylorCos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double x,rad = 3.14159 / 180;
		System.out.println("x	mycos(x)	cos(x)");
		
		for(x = 0; x <= 180; x = x +10) { 
			System.out.printf("" + x );
			System.out.printf("	%5s", mycos(x * rad));
			System.out.printf("	%5s" , Math.cos(x * rad));
			System.out.println();
		}
	}
	

	public static double mycos(double x) {
		double EPS = 1e-8;
		double s = 1,e = 1,d;
		int k;
		
		x = x % 2 * 3.14159265358979;
		for(k = 1; k <= 200; k = k + 2) {
			d = s;
			e = -e * x * x / (k * (k + 1));
			s = s + e;
			
			if(Math.abs(s - d) < EPS * Math.abs(d))
				return s;
		}
		return 9999;	//収束しない場合
	}
}
