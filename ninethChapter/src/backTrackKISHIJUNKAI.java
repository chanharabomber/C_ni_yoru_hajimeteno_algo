/**
 * 今回はチェス版は5 * 5となっている
 * @author yusuke
 *
 */


public class backTrackKISHIJUNKAI {

	
	public static final int N = 5;
	
	public static int[][]m = new int[N +4][N +4];	//版面
	
	public static int[] dx = {2,1,-1,-2,-2,-1,1,2};
	public static int[] dy = {1,2,2,1,-1,-2,-2,-1};
	
	public static int num = 0;
	public static int count = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int i,j;
		
		for(i=0;i<=N+3;i++) {
			for(j=0;j<=N+3;j++) {
				if(2<=i && i<= N+1 && 2<=j && j<=N+1)
					m[i][j] = 0;
				else
					m[i][j] = 1;
			}
		}
		
		backtrack(2,2);
	}
	
	public static void backtrack(int x,int y) {
		
		int i,j,k;
		
		if(m[x][y] == 0){
			m[x][y] = ++count;
			if(count == ( N * N)) {
				System.out.print("解:" + ++num);
				System.out.println();
				for(i=2;i<=N+1;i++) {
					for(j=2;j<=N+1;j++)
						System.out.print(" " + m[i][j]);
					System.out.println();
				}
			} else {
				for(k=0;k<8;k++)
					backtrack(x+dx[k],y+dy[k]);
			}
			
			m[x][y] = 0;
			count--;
			
		}
		
	}

}
