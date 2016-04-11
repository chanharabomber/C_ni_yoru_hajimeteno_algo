
public class fibonattiSaiki {

	/**
	 * @param args
	 */
	
	public static long fib(long n) {
		
		long a,b,dummy;
		int k;
		a = b = 1L;
		for(k=3;k<=n;k++) {
			dummy = b;
			b = a + b;
			a = dummy; 
		}
		return b;
	}
	
	
	public static long fibSelf(long n) {
		
		long a,b,c;
		for(;n > 0;n--) {
			if(n>2) {
				a = fib(n-1);
				b = fib(n-2);
				c = a + b;
				return c;
			} 
		}
		return 1L;
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		long n;
		for(n=1;n<=23;n++)
			System.out.println("" + n + ": "  + fibSelf(n) );
		
	}

}
