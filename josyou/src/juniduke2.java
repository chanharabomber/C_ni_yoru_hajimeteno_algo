
public class juniduke2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int Max = 100;
				
		int[] a = {56,25,67,88,100,61,55,67,76,56};
		final int Num =a.length;
		
		int i;
		int[] juni = new int[Max+2];
		
		for( i=0; i<Max; i++ )
			juni[i] = 0;
		
		for(i = 0; i < Num; i++)
			juni[a[i]]++;
		
		juni[Max+1] = 1;
		for(i = Max; i >= 0; i--)
			juni[i] = juni[i] + juni[i+1];
		
		System.out.println("得点  順位");
		for(i=0;i<a.length;i++)
			System.out.println("" + a[i] + "  " + juni[a[i] + 1]);
	}

}
