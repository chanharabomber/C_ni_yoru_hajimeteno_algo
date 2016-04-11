
public class babblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] a = {80,41,35,90,40,20};
		int N = a.length;
		int t,i,j;
		
		for(i=0;i< N-1;i++) {
			for(j=N-1;j>i;j--) {
				if(a[j] < a[j-1]) {
					t=a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
			
		}
		
		for(i=0;i< N;i++)
			System.out.print(" " + a[i]);

	}

}
