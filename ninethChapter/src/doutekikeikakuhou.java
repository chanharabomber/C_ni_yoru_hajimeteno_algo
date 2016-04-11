import java.util.Arrays;

/**
 * 動的計画法
 * ナップザック問題
 * @author yusuke
 *
 */
public class doutekikeikakuhou {

	//public class doutekikeikakuhou {
		int[] size;
		int[] value;
		int N;
		
		/**
		 * ナップザック問題を表すオブジェクトを生成する
		 */
		public doutekikeikakuhou(int[] size, int[] value) {
			if(size.length != value.length) {
				throw new IllegalArgumentException("sizeとvalueの要素数が一致していません");
			}
			
			this.N = size.length;
			
			this.size = (int[])size.clone();
			
			this.value = (int[])value.clone();
		}
		
		
		public void solve(int m) {
			
			int[] total = new int[m+1];
			
			int[] choice = new int[m+1];
			Arrays.fill(choice, -1);
			
			int repackTotal;
			
			System.out.println("ナップザックの大きさは" + m);
			
			for(int i=0;i<N;i++) {
				
				for(int j=size[i]; j<=m; j++) {
					
					repackTotal = total[j - size[i]] + value[i];
					
					if(repackTotal > total[j]) {
						total[j] = repackTotal;
						choice[j] = i;
					}
				}
				
				System.out.print("i = " + i + "\n");
				System.out.print("total = ");
				for(int j=0;j<=m;j++) {
					System.out.print(pack(4,total[j]));
				}
				System.out.print("\nchoice = ");
				for(int j=0;j<=m;j++) {
					System.out.print(pack(4,choice[j]));
				}
				
				System.out.println();
				
			}
			
			for(int i=m; choice[i] >= 0; i -= size[choice[i]]) {
				System.out.println("品物 " + choice[i] + "(価値" + value[choice[i]] + ")を詰め込む");
			}
			
			System.out.println("価値の合計 = " + total[m]);
			
		}
		
		private static String pack(int len, int value) {
			String s = "   " + value;
			return s.substring(s.length() - len, s.length());
		}
		
		
		private static void absort(String message) {
			System.err.println("起動法: java knapsack 大きさ");
			System.err.println(message);
			System.exit(1);
		}
		
	//}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] ookisa = {2,3,5,7,9};
		int[] value = {2,4,7,11,14};
		doutekikeikakuhou knapsack = new doutekikeikakuhou(ookisa,value);
		
		int size = 0;
		/*
		if(args.length != 1) {
			absort("パラメータの数が違う");
		}
		
		try {
			size = Integer.parseInt(args[0]);
		} catch (Exception e) {
			absort("大きさには正の値を入力してください");

		}
		if(size <= 0) {
			absort("大きさには正の値を入力してください");
		}
		*/
		size = 18;
		knapsack.solve(size);
	}

}
