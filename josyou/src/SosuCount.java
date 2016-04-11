import java.util.*;
public class SosuCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		final int Num = 100;
		int i,n,cnt = 0;
		int[] a = new int[Num/2];
				
		
		for(n=2;n <= Num;n++) {
			for(i = (int) Math.sqrt(n); i > 1; i--) {
				//System.out.println("" + i);
				if(n % i == 0)
					break;
			}
			if((i == 1) && (n != 1)) {
				a[cnt] = n;
				cnt++;
			}
		}	
		System.out.println("" + Num + "までの素数");
		for(i = 0; i < cnt; i++)
			System.out.println(" " + a[i]);
	}

}
