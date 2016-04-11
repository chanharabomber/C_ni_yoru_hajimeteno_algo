/*
 * 
 * 
 * 
 * 
 * 
 */
public class EulerHitohude {

	/**
	 * @param args
	 */
	
	public static int Node = 4;		//接点の数
	public static int Root = 6;		//辺の数
	public static int Start = 1;	//開始点	
	
	public static int[][] a =  {{0,0,0,0,0},
								{0,0,1,0,1},
								{0,1,0,1,2},
								{0,0,1,0,1},
								{0,1,2,1,0}};
	
	public static int success;
	public static int[] v = new int[Root + 1];	//経路を入れるスタック
	public static int n ;						//経過した道の数
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		success = 0;
		n = Root;
		visit(Start);
		if(success == 0)
			System.out.println("解なし");
		
	}

	public static void visit(int i) {
		int j;
		v[n] = i;
		if(n==0 && i == Start) {							//辺の数だけ通過し戻ったら
			System.out.print("解 " + ++success + "::");
			for(i=0;i<=Root;i++)
				System.out.print(" " + v[i]);
			System.out.println();
		} else {
			for(j=1;j<=Node;j++)
				if(a[i][j] != 0) {
					a[i][j]--;		//通った道を切り離す
					a[j][i]--;
					n--;
					visit(j);		//道を復旧
					a[i][j]++;
					a[j][i]++;
					n++;
				}
					
		}
		
		
	}
	
}
