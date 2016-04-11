
public class saisyounijouhou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int N = 7;	//データ数
		final int M = 5;	//当てはめ次数

		double[] x = {-3,-2,-1,0,1,2,3};
		double[] y = {5,-2,-3,-1,1,4,5};
		double[][] a = new double[M + 1][M + 2];
		double[] s = new double[2*M+1];
		double[] t = new double[M+1];

		int i,j,k;
		double p,d,px;
		
		for(i =0;i<=2*M;i++)
			s[i] = 0;
		for(i = 0;i <= M;i++)
			t[i] = 0;
		
		for(i=0;i<N;i++) {
			for(j=0;j<=2*M;j++)
				s[j] = s[j] + Math.pow(x[i], j);	//to calculate from so to s2m 
			for(j=0;j<=M;j++)
				t[j] = t[j] + Math.pow(x[i], j)*y[i];	// to calculate from t0 to tm 
		}
		
		for(i=0;i<=M;i++) {			//insert the value of s[][] to a[][]
			for(j=0;j<=M;j++)
				a[i][j] = s[i+j];
			a[i][M+1] = t[i];
		}
		
		//掃出し
		for(k=0;k<=M;k++) {
			p = a[k][k];
			for(j=k;j<=M+1;j++)
				a[k][j] = a[k][j] / p;
			for(i=0;i<=M;i++) {
				if(i!=k) {
					d = a[i][k];
					for(j=k;j<=M+1;j++)
						a[i][j] = a[i][j] - d * a[k][j];
				}
			}
			
			
		}

		System.out.println("	x		y");
		for(px=-3;px<=3;px = px + 0.5) {
			p = 0;
			for(k=0;k<=M;k++)
				p = p+a[k][M+1]*Math.pow(px, k);
			System.out.println("" + px + "		" + p);
		}
		
	}

}
