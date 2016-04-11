import java.util.Scanner;


public class jankenWizStrategy {

		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int man,computer,M,judge;
		int[][] table = {{0,0,0},
						{0,0,0},
						{0,0,0}};
		int[] hist = {0,0,0};
		String[] hand = {"グー","チョキ","パー"};
		M=0;
		
		while(true) {
			if(table[M][0] > table[M][1] && table[M][0] > table[M][2])
				computer = 2;
			else if(table[M][1] > table[M][2])
				computer = 0;
			else
				computer = 1;
			
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.println("あなたの手: ");
			man = sc.nextInt();
			
			System.out.println("computerの手: " + hand[computer]);
			
			judge = (computer - man + 3) % 3;
			
			switch(judge) {
				case 0: System.out.println("引き分け"); break;
				case 1: System.out.println("あなたの勝ち"); break;
				case 2: System.out.println("あなたの負け"); break;
			}
			
			hist[judge]++;
			table[M][man]++;	//学修
			M = man;
			System.out.println("---" + hist[1] + "勝" + hist[2] + "敗" + hist[0] + "分");
		
		}
		
		
		
	}

}
