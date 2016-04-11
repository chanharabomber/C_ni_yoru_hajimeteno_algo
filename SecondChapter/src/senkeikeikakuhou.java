
public class senkeikeikakuhou {

	/**
	 * 線形計画法 Linea Programing
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		final int N1 = 4;	//行数
		final int N2 = 6;	//列数
		final int N3 = 2;	//変数の数
		
		double[][] a = {{1,2,1,0,0,14},
						{1,1,0,1,0,8},
						{3,1,0,0,1,18},
						{-2,-3,0,0,0,0}};
		
		double min,p,d;
		int j,k,x,y,flag;
		
		x = y=1;
		while(true) {	//無限ループ
			
			//列選択
			min = 9999;
			for(k=0;k < (N2-1);k++) {
				if(a[N1-1][k] < min) {
					min = a[N1-1][k];
					y = k;
				}
			}
			
			if(min >= 0)
				break;	//解を得た
			
			
			min = 9999;	//行選択
			for(k =0; k < (N1-1);k++) {
				p=a[k][N2-1] / a[k][y];
				if((a[k][y] > 0) && (p < min)) {
					min = p;
					x = k;
				}
				
			}
			
			p = a[x][y];	// ピボット係数
			for(k = 0;k < N2;k++)
				a[x][k] = a[x][k] / p;	//ピボット行をpで割る
			
			for(k=0;k < N1;k++) {	//ピボット行の掃出し
				if(k != x) {
					d = a[k][y];
					for(j = 0;j < N2;j++)
						a[k][j] = a[k][j] - d*a[x][j];
				}
			}

		}
		
		
		for(k = 0; k<N3;k++) {
			flag = -1;
			for(j = 0;j<N1;j++) {
				if(a[j][k] == 1)
					flag = j;
			}	
			if(flag != -1)
				System.out.println("x" + k + " = " + "" + a[flag][N2-1]);
			else
				System.out.println("x" + k + " = " + "0");
		}
		
		System.out.println("z = " + a[N1-1][N2-1]);			
	}
}
