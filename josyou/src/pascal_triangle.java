
public class pascal_triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int n,r,t;
		for(n=0;n<=12;n++) {
			for(t=0;t<(12-n)*3;t++)
			System.out.print(" ");
			for(r=0;r<=n;r++)
			System.out.print(" " + combi(n,r));
			
			System.out.println("");
		}
	}

	public static double combi(int n,int r) {
		
		double p=1;
	
		for(int i=1;i<=r;i++) {
			p = p * (n-i+1) / i;
		}
	
	return p;
	}
	
}
