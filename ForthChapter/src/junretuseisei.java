
public class junretuseisei {

	/**
	 * @param args
	 */
	
	//生成したい順列の数
	final static int N = 4;
	final static  int[] p = new int[N+1];
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			
		int i;
		for(i=1;i<=N;i++)
			p[i] = i;
		perm(1);
	}
	
	public static void perm(int i) {
		
		int j,t;
		
		if(i<N) {
			for(j=i;j<=N;j++) {
				t=p[i]; p[i]=p[j]; p[j]=t;
				perm(i+1);
				t=p[i]; p[i]=p[j]; p[j]=t;
			}
		} else {
			for(j=1;j<=N;j++)
				System.out.print(" " + p[j]);
			System.out.println();
		}
		
		
	}

}
