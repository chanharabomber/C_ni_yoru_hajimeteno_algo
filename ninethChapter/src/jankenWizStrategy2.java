/**
 * ひとつ前のCコンピュータの手をC,人間の手をM,今出したコンピュータの手をcomputer
 * 
 * @author yusuke
 *
 */

import java.util.Scanner;
public class jankenWizStrategy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int man,computer,C,M,judge;
		int[][][] table = {{{0,0,0},{0,0,0},{0,0,0}},
						{{0,0,0},{0,0,0},{0,0,0}},
						{{0,0,0},{0,0,0},{0,0,0}}};
		int[] hist = {0,0,0};
		String[] hand = {"グー","チョキ","パー"};
		M= C =0;
		while(true) {
			if(table[C][M][0] > table[C][M][1] && table[C][M][0] > table[C][M][2])
				computer = 0;
			else if(table[C][M][1] > table[C][M][2])
				computer = 1;
			else
				computer = 2;
				
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.println("あなたの手: ");
			man = sc.nextInt();
			
			System.out.println("computerの手: " + hand[computer]);
			
			judge = (computer - man + 3) % 3;
			
			switch(judge) {
				case 0: System.out.println("引き分け");
						table[C][M][(computer + 2)%3]++;
						break;
				case 1: System.out.println("あなたの勝ち");
						table[C][M][computer]--;
						break;
				case 2: System.out.println("あなたの負け");
						table[C][M][computer]++;
						break;
			}
			
			
			M = man;
			C = computer;
			
			hist[judge]++;
			System.out.println("---" + hist[1] + "勝" + hist[2] + "敗" + hist[0] + "分");
		}
		
	}

}
