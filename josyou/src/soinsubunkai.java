import java.util.Scanner;


public class soinsubunkai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,n;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を入力してください。");
		n = stdIn.nextInt();
		a = 2;
		while( n >= a*a ) {
			if( n % a == 0) {
				System.out.print("" + a + " * ");
				//System.out.println("n= " + n + "a= " + a);
				n = n / a;
			} else
				a++;
		}
		System.out.print("" + n);
	}

}
