
public class nibunhou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final double EPS = 1e-8;	//打切り誤差
		final int LIMIT = 50;		//打切り回数
		
		double low,high,x;
		int k;
		
		low = -2; high = 2;
		
		for (k =1; k <= LIMIT; k++) {
			x = (low + high) / 2;
			if(f(low) * f(x) < 0)
				high = x;
			else
				low = x;
			
			if(f(x) == 0 || Math.abs(f(x)) < EPS) {
				System.out.println("x = " + x);
				break;
			}
		}
		if(k > LIMIT)
			System.out.println("収束しない");
	}
	
	public static double f(double x) {
		double y;
		y = x * x * x - x + 1;
		return y;
	}

}
