import java.util.Random;

public class ransu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int N = 20;
		int i,j,temp;
		int[] a = new int[N+1];
		
		for(i = 1; i <= N; i++)
			a[i] = i;
		
		for(i = N; i > 1; i--) {
			j = rand(N-1);
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			//System.out.print("j=" + j);
		}
			
		for(i = 1; i <= N; i++)
			System.out.print("  " + a[i]);
				
	}
	
	public static int rand(int n) {
		Random rnd = new Random();
		int r;
		r = rnd.nextInt(n) + 1 ;
		return r;
	}	
	
}


