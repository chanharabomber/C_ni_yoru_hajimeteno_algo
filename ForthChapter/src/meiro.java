
public class meiro {

	/**
	 * @param args
	 */
	
	public static int[][] m ={{2,2,2,2,2,2,2},
						{2,0,0,0,0,0,2},
						{2,0,2,0,2,0,2},
						{2,0,0,2,0,2,2},
						{2,2,0,2,0,2,2},
						{2,0,0,0,0,0,2},
						{2,2,2,2,2,2,2}};
	
	public static int successFalg=0;
	
	//入口の座標
	public static int si=1;
	public static int sj=1;
	//出口の座標
	public static int ei=5;
	public static int ej=5;
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		System.out.println("迷路の探索:");
		if(visit(si,sj) == 0)
			System.out.println("出口は見つかりませんでした。");

	}

	public static int visit(int i,int j) {
		
		m[i][j] = 1;	//訪れた場所にしるしをつける
		
		if(i == ei && j == ej)
			successFalg =1;
		
		if(successFalg != 1 && m[i][j+1] == 0)	visit(i,j+1);	//右
		if(successFalg != 1 && m[i+1][j] == 0)	visit(i+1,j);	//下
		if(successFalg != 1 && m[i][j-1] == 0)	visit(i,j-1);	//左
		if(successFalg != 1 && m[i-1][j] == 0)	visit(i-1,j);	//上
		
		if(successFalg == 1)
			System.out.print("( " + i + " , " + ""+ j + " )");
		
		return successFalg;
	
	}
	
}
