
public class gausunosyokyohou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int N = 3;	//元の数
		double[][] a = {{2,3,1,4},
						{4,1,-3,-2},
						{-1,2,2,2}};
		
		double d;
		int i,j,k;
		
		//前進消去
		for(k=0;k<N-1;k++) {
			
			for(i =k+1;i<N;i++) {
				d = a[i][k]/a[k][k];
				for(j=k+1;j<=N;j++){
					a[i][j]=a[i][j]-a[k][j]*d;					
				}
			}
		}
	
		//後退代入
		
		for(i=N-1;i>=0;i--) {
			d=a[i][N];
			for(j=i+1;j<N;j++)
				d = d-a[i][j]*a[j][N];
			a[i][N]=d/a[i][i];
		}
		for(k=0;k<N;k++)
			System.out.println("x" + k + " = " + "" + a[k][N]);
		
	}

}
