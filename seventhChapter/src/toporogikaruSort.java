/**
 * トぽロジカルソート
 * 有効グラフで1->2のとき1の仕事が終わっていないと2が出来ないと仮定する
 * その時しなければならない仕事の順序
 * @author yusuke
 *
 */
public class toporogikaruSort {

	/**
	 * @param args
	 */
	public static final int N = 8;		//点の数
	
	public static int[][] a =  {{0,0,0,0,0,0,0,0,0},	//隣接行列
								{0,0,0,1,0,0,0,0,0},
								{0,1,0,0,0,1,0,0,0},
								{0,0,0,0,1,0,0,1,0},
								{0,0,0,0,0,0,0,0,0},
								{0,0,0,0,1,0,1,0,0},
								{0,0,0,0,0,0,0,1,1},
								{0,0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,1,0}};
										
	//訪問フラグ
	public static int[] v = new int[N +1];
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		
		for(i=1;i<=N;i++)
			v[i]=0;

		for(i=1;i<=N;i++) {
			if(v[i] == 0)
				visit(i);
		}
		
		System.out.println();
		
	}

	public static void visit(int i) {
		
		int j;
		v[i] = 1;
		for(j=1;j<=N;j++) {
			if(a[i][j] == 1 && v[j] == 0)
				visit(j);
		}
		System.out.print(" " + i);
	}
	
}
