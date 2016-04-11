
public class kaijou_saiki {

	/**
	 * @param args
	 */
	public static long kaijo(int n) {
		if(n==0)
			return 1L;
		else
			return n*kaijo(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int n=0;
		for(n=0;n<12;n++) {
			System.out.println("" + n + "! = " + "" + kaijo(n));
			
		}
	}

}
