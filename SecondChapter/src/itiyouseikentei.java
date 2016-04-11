
public class itiyouseikentei {

	public static void main(String[] args) {
		

		final int N = 1000;
		final int M = 10;
		final int F = N/M;
		final double SCALE = (40.0 / F);
		
		int i,j,rank;
		int[] hist = new int[M + 1];
		double e = 0.0;
		
		final double rn = 13;
		double temp = 0;
		for(i = 1; i <= M; i++)
			hist[i] = 0;
		
		temp = rn;
		for(i = 0; i < N; i++) {
			rank = (int)( M * rnd(irnd(temp)) + 1);
			temp = irnd(temp);
			hist[rank]++;
		}
		
		for(i = 1; i <= M; i++) {
			System.out.print("" + i + ":" + hist[i] + " ");
			for(j = 0; j < hist[i] * SCALE; j++)
				System.out.print("*");
			System.out.println();
			
			e = e + (double)(hist[i] - F) * (hist[i] - F) / F;
			
		}
		System.out.println("χ^2 = " + e);
	}
	
	// 0 ~ 32767
	public static double irnd(double n) { 
		
		double rundnum;
		rundnum = ( n * 109 + 1021 ) % 32768;
		return rundnum;
		
	}
	
	//0~1miman
	public static double rnd(double n) {
		return irnd(n) / 32862.1;
	}
	
}
