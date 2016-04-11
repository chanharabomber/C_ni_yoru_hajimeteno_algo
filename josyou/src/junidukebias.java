
public class junidukebias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ゴルフのスコア範囲を-20から36とした場合
		final int Max = 36;
		final int Min = -20;
		
		final int Bias = 1-(Min);
		
		int[] a = {-3,2,3,-1,-2,-6,2,-1,1,5};
		int i;
		int[] juni = new int[Max + Bias + 1];
		final int Num = a.length;
		System.out.println("Bias = " + Bias);
		
		for(i=Min+Bias;i<=Max+Bias;i++) {
			juni[i]=0;
			//System.out.println(""+i+"  " + juni[i]);
		}
		
		for(i=0;i<Num;i++)
			juni[a[i] + Bias]++;
	
		juni[0]=1;
		for(i = Min + Bias; i<=Max+Bias; i++) {
			juni[i] = juni[i] + juni[i-1];
			//System.out.println("" + juni[i]);
		}
		
		System.out.println("得点  順位");
		for(i=0;i<Num;i++)
			System.out.println("" + a[i] + "  " + juni[a[i] + Bias - 1]);
	}

}
