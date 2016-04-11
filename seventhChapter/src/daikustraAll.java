import java.util.Scanner;


public class daikustraAll {

	
	//接点の数
	public static int N = 8;
	public static int M = 9999;
	
	public static int[][] a =  {{0,0,0,0,0,0,0,0,0},	/* 隣接行列 */
								{0,0,1,7,2,M,M,M,M},
								{0,1,0,M,M,2,4,M,M},
								{0,7,M,0,M,M,2,3,M},
								{0,2,M,M,0,M,M,5,M},
								{0,M,2,M,M,0,1,M,M},
								{0,M,4,2,M,1,0,M,6},
								{0,M,M,3,5,M,M,0,2},
								{0,M,M,M,M,M,6,2,0}};
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		int j,k,p,start,min;
		p=0;
		int[] leng = new int[N +1];	//接点までの距離
		int[] v = new int[N +1];	//確定フラグ
		int[] index = new int[N +1];	//前の接点へのポインタ
		
		System.out.print("始点を入力してください:");
		start = sc.nextInt();
		
		for(k=1;k<=N;k++) {
			leng[k] = M;
			v[k] = 0;
		}
		
		leng[start] = 0;
		index[start] = 0;	//始点はどこも示さない
	
		for(j=1;j<=N;j++) {
			min = M;					//最小の接点を探す
			for(k=1;k<=N;k++) {
				if(v[k] == 0 && leng[k] < min) {
					p = k;
					min = leng[k];
				}
			}
			v[p] = 1;	//最小の接点を確定する
			
			if(min == M) {
				System.out.println("連結ではない");
				break;
			}
			
			//pを経由してkに至る長さがそれまでの最短炉より小さければ更新
			for(k=1;k<=N;k++) {
				if((leng[p] + a[p][k]) < leng[k]) {
					leng[k] = leng[p] + a[p][k];
					index[k] = p;
				}
			}
			
		}
		
		//最短炉のルートの表示
		for(j=1; j<= N;j++) {
			System.out.print("" + leng[j] + " : " + j);
			p = j;
			while(index[p] != 0 ) {
				System.out.print(" <--- " + index[p]);
				p = index[p];
			}
			System.out.println();
		}
	}

}
