
public class backTrack8queen {

	public static final int N = 8;
	
	public static int[] columm = new int[N +1];	//同じ欄に王妃が置かれていることを表す
	public static int[] rup = new int[2*N +1];	//右上がりの対角線上に置かれているか
	public static int[] lup = new int[2*N +1];	//左上がりの対角線上に置かれているか
	public static int[] queen = new int[N +1];	//王妃の位置
	
	public static int num = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		
		for(i =1;i<=N;i++)
			columm[i] = 1;
		
		for(i=1;i<=2*N;i++) {
			rup[i]=1;
			lup[i] = 1;
		}
		
		backtrack(1);
		
	}

	public static void backtrack(int i) {
		
		int j,x,y;
		
		//解の表示
		if(i>N) {
			System.out.print("解:" + ++num );
			System.out.println();
			for(y=1;y <= N;y++) {
				for(x=1;x <= N;x++) {
					if(queen[y] == x)
						System.out.print(" Q");
					else
						System.out.print(" .");
				}
				System.out.println();
			}
		} else {
		
			for(j=1;j<=N;j++) {
				if(columm[j]==1 && rup[i+j]==1 && lup[i-j+N]==1) {
					queen[i] = j;			//(i,j)がクイーンの位置
					columm[j] = rup[i + j] = lup[i-j+N] = 0;	//局面の変更
					backtrack(i+1);
					columm[j] = rup[i+j] = lup[i-j+N] = 1;		//局面の戻し
				}
			}
		}
		
	}
	
	
}
