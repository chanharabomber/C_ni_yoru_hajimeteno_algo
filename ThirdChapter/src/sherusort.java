import java.util.Random;

public class sherusort {

	/**
	 * @param args
	 */
	
	final static int N = 100;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		Random rand = new Random();
		int i,j,t;
		int[] a = new int [N];
		
		for(i=0;i<N;i++)
			a[i] = Math.abs(rand.nextInt());
		
		for(i=1;i<N;i++) {
			for(j=i-1;j>=0;j--) {
				if(a[j] > a[j+1]){
					t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for(i=0;i<N;i++) {
			System.out.print("  " + a[i]);
			if((i%10)==0)
				System.out.println();
		}
	}

}
