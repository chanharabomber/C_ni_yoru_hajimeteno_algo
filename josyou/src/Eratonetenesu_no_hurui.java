
public class Eratonetenesu_no_hurui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int Num = 1000;
		int[] a = new int[Num + 1];
		int i,j,lim,cnt =0;
		
		for(i = 2;i <= Num;i++ )
			a[i] = 1;	// a[j]の要素が1のものが素数
		
		lim = (int) Math.sqrt(Num);
		for( i = 2; i <= lim; i++) {
			if(a[i] == 1) {
				for( j = i * 2; j <= Num; j++) {
					if(j % i == 0)
						a[j] = 0;	//素数でない要素には0を代入
				}
			}
		}
		
		for(i = 2; i <= Num; i++) {
			
			if(a[i] == 1) {
				System.out.print(" " + i);
				cnt++;
			}
			
			if(cnt == 10) {
			System.out.println();
			cnt=0;
			}
		}
	}

}
