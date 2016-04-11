
public class tyokusetsusentakuhou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] a = {80,41,35,90,40,20};
		int min,s,t,i,j;
		int N = a.length;
		for(i=0;i<N-1;i++ ) {
			min=a[i];
			s=i;
			for(j = i+1;j<N;j++) {
				if(a[j] < min) {
					min = a[j];
					s=j;
				}
				
			}
			t = a[i];
			a[i] = a[s];
			a[s]=t;
			
		}
		
		for(i=0;i<N;i++)
			System.out.print(" " + a[i]);
	}

}
