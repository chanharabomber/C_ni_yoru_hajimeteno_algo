
public class NewtonInterpolation {

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
			System.out.println(" " + t + "		" + Newton(x,y,x.length,t));
	}

	
	public static double Newton(double[] x, double[] y, int n, double t) {
		
		int flag = 1;
		final double[] a = new double[100];
		double[] w = new double[100];
		double s;
		int i,j;
		
		if(flag == 1 ) {
			
			for (i = 0; i < n; i++) {
				w[i] = y[i];
				for(j = i-1; j >= 0; j--)
					w[j] = (w[j+1] - w[j]) / (x[i] - x[j]);
				a[i] = w[0];
			}
			
		}
		
		s = a[n-1];
		for(i = n-2; i >= 0; i--)
			s = s * (t - x[i]) + a[i];
		
		return s;
	}
}
