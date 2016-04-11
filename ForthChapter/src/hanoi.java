/**
 * hanoi tower
 * 
 * 		|	|	|
 * 		| 	|	|
 * 		|	|	|
 * 		=	=	=
 * 		a	b	c
 * 
 */

import java.util.Scanner;


public class hanoi {

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
		
		hanoi(n,'a','b','c');
		
		System.out.println("Stop!!!!!");
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime);
		System.out.println("かかった時間は " + time);
	}
	
	public static void hanoi(int n,char a,char b,char c) {
		if(n>0) {
			hanoi(n-1,a,c,b);
			System.out.println("" + n + "番の円盤を " + "" + a + " から " + b + " へ移動.");
			hanoi(n-1,c,b,a);
		}
		
	}

}
