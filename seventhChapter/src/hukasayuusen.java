
public class hukasayuusen {

	/**
	 * @param args
	 */
	
	public static int N = 8;	//点の数
	
	//隣接行列
	public static int[][] a = {{0,0,0,0,0,0,0,0,0},
								{0,0,1,0,0,0,0,0,0},
								{0,1,0,1,1,0,0,0,0},
								{0,0,1,0,0,0,0,1,0},
								{0,0,1,0,0,1,0,0,0},
								{0,0,0,0,1,0,1,0,0},
								{0,0,0,0,0,1,0,1,1},
								{0,0,0,1,0,0,1,0,1},
								{0,0,0,0,0,0,1,1,0}};
	
	//訪問フラグ
	public static int[] v = new int[N +1]; 
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		
		for(i=1;i<=N;i++)
			v[i]=0;
		visit(1);
		
	}

	public static void visit(int i) {
		
		int j;
		
		v[i] = 1;
		for(j=1;j<=N;j++) {
			if(a[i][j] == 1 && v[j] == 0) {
				System.out.print("" + i + "->" + "" + j + " ");
				visit(j);
			}
		}
		
	}
}
