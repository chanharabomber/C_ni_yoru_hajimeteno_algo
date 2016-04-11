
public class gausujorudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int N = 3;	//元の数
		double[][] a = {{2,3,1,4},
						{4,1,-3,-2},
						{-1,2,2,2}};
		double p,d;
		int i,j,k;
		
		for(k = 0;k < N;k++) {
			p = a[k][k];
			for(j = k;j < N+1;j++) {
				a[k][j] = a[k][j] / p;
				//列をピボットで割る 
			}
			
			//ここからがミソ
				for(i = 0;i < N;i++) {
					if(i != k) {
						d = a[i][k];
						for(j = k; j<N+1;j++)
							a[i][j] = a[i][j] - d*a[k][j];
					}
				}
		}
		for(k=0;k<N;k++)
			System.out.println("x" + k + " = " + "" + a[k][N]);
		
	}

}
