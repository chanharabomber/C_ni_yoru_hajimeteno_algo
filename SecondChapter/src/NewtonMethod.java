
public class NewtonMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final double EPS = 1e-8;	//打切り誤差
		final int LIMIT = 50;		//打切り回数
		
		double x = -2;
		double dx;
		int k;
		
		for(k = 1; k <= LIMIT; k++) {
			dx = x;
			x = x - f(x) / g(x);
			if(Math.abs(x-dx) < Math.abs(dx) * EPS) {
				System.out.println("x = " + x);
				break;
			}
		}
	} 

	public static double f(double x) {
		double y;
		y = x * x * x - x + 1;
		return y;
	}
	
	public static double g(double x) {
		double y;
		y = 3 * x * x - 1;
		return y;
	}
}
