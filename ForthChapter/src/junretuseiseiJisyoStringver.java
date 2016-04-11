/**
 * 文字ヴァージョン(辞書)
 * @author yusuke
 *
 */
public class junretuseiseiJisyoStringver {

	/**
	 * @param args
	 */
	
	final static int N =4;
	final static  int[] p = new int[N +1];
	static String s = "dws12";
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		final char[] charArray = s.toCharArray();
		for (char ch : charArray) {
		    System.out.println(ch);
		}
		
		
		/*
		for(i=1;i<=N;i++) {
			p[i] = i;
		}
		*/
		p[1] = 'a';
		p[2] = 'c';
		p[3] = 'h';
		p[4] = 't';
		perm(1);
		
		
	}

	public static void perm(int i) {
		
		int j,t,k;
			
		if(i<N) {
			for(j=i;j<=N;j++) {
				t=p[j];
				for(k=j;k>i;k--)
					p[k] = p[k-1];
				p[i]=t;
				
				perm(i+1);
				
				for(k=i;k<j;k++)
					p[k] = p[k+1];
				p[j] = t;
			}
			
		} else {
			for(j=1;j<=N;j++) 
				System.out.print(" " + (char)p[j]);
			System.out.println();
		}
		
	}
	
}
