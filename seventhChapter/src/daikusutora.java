import java.util.*;
public class daikusutora {

	/**
	 * @param args
	 */
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

	
		
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		int j,k,p,start,min;
		p=0;
		int[] leng = new int[N +1];	//接点までの距離
		int[] v = new int[N +1];	//確定フラグ
		
		System.out.print("始点を入力してください:");
		start = sc.nextInt();
		
		for(k=1;k<=N;k++) {
			leng[k] = M;
			v[k] = 0;
		}
		
		leng[start] = 0;
		for(j=1;j<=N;j++) {
			min = M;
			//最小の接点を探す
			for(k=1;k<=N;k++) {
				if(v[k] == 0 && leng[k] < min) {
					p = k;
					min = leng[k];
				}
			}
			v[p] = 1;	//最小の接点を確認する
			
			if(min == M){
				System.out.println("グラフは連結ではない");
				break;
			}
			
			// pを経由してkに至る長さがそれまでの最短炉より小さければ更新
			for(k=1;k<=N;k++) {
				if((leng[p] + a[p][k]) < leng[k])
					leng[k] = leng[p] + a[p][k];
			}
			
		}
		
		//(a,b...)は点の名前のこと
		//System.out.println("a="+ (int)'a');
		for(j=1;j<=N;j++)
			System.out.println("" + start + " -> " + j + "(" + (char)(j+96) + ") : " + "" + leng[j]);
		
	}

}
