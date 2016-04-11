
public class mahoujin4N {

	
	public static int N = 8;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] hojin = new int[N +1][N +1];
		int i,j;
		
		for(j = 1;j<=N;j++) {
			for(i=1;i<=N;i++) {
				if(j%4 == i%4 ||(j%4 + i%4) % 4 == 1 )
					hojin[i][j] = (N + 1 - i)*N - j +1;
				else
					hojin[i][j] = (i-1)*N +j;
				
			}
		}
		
		System.out.println("	4N魔方陣 N = " + N);
		for(i=1;i<=N;i++) {
			for(j=1;j<=N;j++)
				System.out.print(" " + hojin[i][j]);
			System.out.println();
		}
	}

}
