/* text p50
 * xn = (Axn-1 + C) mod M
 * A = 109 C = 1021 M = 32768 x0 = 13 を用いた
 */

public class ransu {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		

		int j;
		long  rundnum = 13;
		
		for(j = 0; j < 100; j++) {
			rundnum = ( rundnum * 109 + 1021 ) % 32768;
			System.out.print("    " + rundnum);
			if(j % 10 == 9)
				System.out.println();
		}

	}
}
