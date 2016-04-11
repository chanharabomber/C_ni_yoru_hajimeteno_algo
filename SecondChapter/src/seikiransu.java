
public class seikiransu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,j;
		int[] hist = new int[100];
		double x,y;
		
		for(i = 0; i < 100; i++)
			hist[i] = 0;
		
		
		for(i = 0; i < 1000; i++) {
			SeikiransuBrnd sb = new SeikiransuBrnd(2.5,10.0);
			x = sb.getX();
			y = sb.getY();
			hist[(int)x]++;
			hist[(int)y]++;
		}
		
		for(i = 0; i <= 20; i++) {
			if(i < 10)
				System.out.print(" ");
			
			System.out.print(" " + i + " : I");
			for(j =1; j <= hist[i]/10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
