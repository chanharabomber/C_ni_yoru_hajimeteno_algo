
public class toporogikaruSort2 {

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
	//ソート結果を格納用
	public static int[] s = new int[N +1];
	
	public static void main(String args[]) {
		
		int i;
		
		for(i=1;i<=N;i++)
			v[i]=0;

		for(i=1;i<=N;i++) {
			if(v[i] == 0)
				visit(i);
		}
		for(i=N;i>=1;i--)
			System.out.print(" " + s[i]);
		
		System.out.println();
	}
	
	public static int sp =1;
	public static void visit(int i) {
		
		int j;
		
		
		v[i] = 1;
		for(j=1;j<=N;j++) {
			if(a[i][j] == 1 && v[j] == 0)
				visit(j);
			if(a[i][j] == 1 && v[j] == 1) {
				System.out.print("" + i + "と" + "" + j + "の付近にループがあります." );
				break;
			}
		}
		v[i] = 2;	//閉路判定のため
		s[sp++]=i;	//スタックに格納
		
	}
	
}
