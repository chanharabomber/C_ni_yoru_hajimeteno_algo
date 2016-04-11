import java.util.Random;


public class sherusortkairyou {

	/**
	 * @param args
	 */
	
	final static int N = 100;	//data
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random rand = new Random();
		int i,j,t,k,gap;
		int[] a = new int [N];
		
		for(i=0;i<N;i++)
			a[i] = Math.abs(rand.nextInt());
		
		gap = N / 2;	//ギャップの初期値
		
		while(gap > 0) {
			for(k=0;k<gap;k++) {	//ギャップとびの部分数列のソート
				for(i=k+gap;i<N;i=i+gap){
					for(j=i-gap;j>=k;j=j-gap){
						if(a[j] >a[j+gap]) {
							t=a[j];
							a[j] =a[j+gap];
							a[j+gap]=t;
						}
					}
				}
			}
			gap=gap/2;
		}
		
		for(i=0;i<N;i++) {
			System.out.println("  " + a[i]);
			//if((i%10)==0)
				//System.out.println();
		}
	}

}
