
public abstract class habayuusentansaku {

	/**
	 * @param args
	 */
	
	public static int N = 8;	//点の数
	
	//隣接行列
	public static int[][] a = {{0,0,0,0,0,0,0,0,0},
								{0,0,1,0,0,0,0,0,0},
								{0,1,0,1,1,1,0,0,0},
								{0,0,1,0,0,0,0,1,0},
								{0,0,1,0,0,0,0,0,0},
								{0,0,1,0,0,0,1,0,0},
								{0,0,0,0,0,1,0,1,1},
								{0,0,0,1,0,0,1,0,1},
								{0,0,0,0,0,0,1,1,0}};
	
	//訪問フラグ
	public static int[] v = new int[N +1]; 
	
	public static int[] queue = new int[100];	//キュー
	
	public static int head = 0,		//先頭データのインデックス
					  tail = 0;		//終端データのインデックス
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i,j;
		for(i=1;i<=N;i++)
			v[i] = 0;
		
		queue[tail ++] = 1;
		v[1] = 1;
		
		do {
			i=queue[head++];	//キューから取り出す
			for(j=1;j<=N;j++) {
				if(a[i][j] == 1 && v[j] == 0) {
					System.out.print("" + i + "->" + "" + j + " ");
					queue[tail++] = j;
					v[j] = 1;
				}
				
			}
			
		} while(head != tail);
		
	}

}
