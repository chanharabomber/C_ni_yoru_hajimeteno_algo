//シェッカーソート バブルソートの改良版

//miss

public class shekkasort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] a = {3,5,6,9,2,7,8,10,4};
		int N = a.length;
		int left,right,shift,i,t;
		
		left=0;
		right=(N-1);
		shift=0;
		while(left < right) {
			for(i = left;i < right;i++) {
				if(a[i] > a[i + 1]) {
					t = a[i];
					a[i] = a[i+1];
					a[i+1] = t;
					shift = i;
				}
			}
			right = shift;
			for(i = right;i>left;i--) {
				if(a[i] < a[i-1]) {
					t = a[i];
					a[i] = a[i-1];
					a[i-1] = t;
					shift = i;
				}
			}
			
			left = right;
		}
		
		for(i=0;i<N;i++)
			System.out.print(" " + a[i]);
		
	}

}

miss
