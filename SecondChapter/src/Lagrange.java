
public class Lagrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double[] x = {0.0,1.0,3.0,6.0,7.0};
		double[] y = {0.8,3.1,4.5,3.9,2.8};
		double t;
		
		System.out.println(" x		y");
		for(t = 0.0;t <= 7.0; t = t + 0.5)
			System.out.println(" " + t + "		" + Lagran(x,y,x.length,t));
	}

	
	public static double Lagran(double[] x, double[] y, int n, double t) {
		
		int i,j;
		double s,p;
		
		s = 0;
		for (i = 0;i < n; i++) {
			p = y[i];
			for (j = 0; j < n; j++) {
				if(i != j)
					p = p * (t - x[j]) / (x[i] - x[j]);
			}
			s = s + p;
		}
		
		return s;
	}
}
