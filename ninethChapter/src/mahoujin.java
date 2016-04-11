/**
 *  |  ->j
 *  v  - - - - -
 *  i  |
 *     |
 *     |
 *  
 *  アルゴリズム
 *  第一行の中央に1を代入
 *  入れる数をおおおきさNで割ったあまりが1であればすぐ下のマスへ進み
 *  そうでなければ斜め上へ進む
 *  もし上へはみだしたら同じ列の一番下へ
 *  もし右へはみ出したら同じ行の左へ
 *  
 * @author yusuke
 *
 */
public class mahoujin {

	public static int N = 7;	// N方陣 N=1,3,5... odd number
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] hojin = new int[N +1][N +1];
		
		int i,j,k;
		
		i=0;
		j=(N +1) / 2;
		
		for(k=1;k<=N*N;k++) {
			if((k%N) == 1)
				i++;
			else {
				i--;
				j++;
			}
			
			if(i == 0)
				i=N;
			if(j > N)
				j=1;
			hojin[i][j] = k;
		}
		
		System.out.println("	奇数魔法陣 N = " + N);
		for(i=1;i<=N;i++) {
			for(j=1;j<=N;j++) {
				System.out.print(" " + hojin[i][j]);
			}
			System.out.println();
		}
	}

}
