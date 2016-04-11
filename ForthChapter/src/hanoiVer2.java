import java.util.Scanner;


public class hanoiVer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("円盤の枚数は? :");
		n = sc.nextInt();
		
		System.out.println("start(計算時間を図る)");
		long startTime = System.currentTimeMillis();
		
		hanoi(n,'a','b');
		
		System.out.println("Stop!!!!!");
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime);
		System.out.println("かかった時間は " + time);
		
	}

	public static void hanoi(int n,char a,char b) {
		if(n>0) {
			//hanoi(n-1,'a','a'+'b'+'c'-('a'+'b'));
			
		}
		
	}
}
