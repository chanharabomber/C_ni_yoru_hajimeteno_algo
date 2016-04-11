
public class junretuseiseiJisyo {

	/**
	 * @param args
	 */
	
	
	final static int N = 4;
	final static  int[] p = new int[N +1];
	
	//文字は少し改良が必要
	final static String s = "abcdefg";
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		final char[] charArray = s.toCharArray();
		for (char ch : charArray) {
		    System.out.println(ch);
		}
		

		for(i=1;i<=N;i++) {
			p[i] = i;
		}
		perm(1);
		
		
	}

	public static void perm(int i) {
		
		int j,t,k;
		String ss = new String(s);
		
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
			for(j=1;j<=N;j++) {
				System.out.print(" " + p[j]);
				//System.out.print(" " + ss.charAt(j));
			}
			System.out.println();
		}
		
	}
	
}
