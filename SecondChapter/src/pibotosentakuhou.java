//import java.util.*;


public class pibotosentakuhou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int N = 3;	//元の数
		double[][] a = {{2,3,1,4},
						{4,1,-3,-2},
						{-1,2,2,2}};
		double p,d,max,dumy;
		int i,j,k,s;
		
		for(k=0;k<N;k++) {
			
			max=0;
			s=k;
			
			for(j=k;j<N;j++){
				if(Math.abs(a[j][k])>max) {
					max = Math.abs(a[j][k]);
					s =j;
				}
			}
			if(max == 0) {
				System.out.println("解けねー");
				//exit();
			}
			for(j=0;j<=N;j++) {
				dumy = a[k][j];
				a[k][j] = a[s][j];
				a[s][j] = dumy;
			}
			
			p = a[k][k];
			
			for(j=k;j< N+1;j++)
				a[k][j] = a[k][j] / p;
			
			for(i=0;i < N;i++) {
				if(i != k) {
				d = a[i][k];
				for(j =k;j < N+1;j++)
					a[i][j] = a[i][j] - d*a[k][j];
				}
			}
		}
		
		for(k=0; k < N;k++)
			System.out.println("x" + k + " = " + "" + a[k][N]);
		
		
	}

	private static void exit(int i) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	private static boolean fabs(double d) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
