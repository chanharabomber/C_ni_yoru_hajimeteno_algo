import java.util.Random;

public class montekaruro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// 例外処理
		
		/*if (args.length != 1 ) {
			System.out.println("引数の数がただしくありません.");
			System.exit(1);
		} */
			int n = (int)(Double.parseDouble(args[0]));
			System.out.println("Start!!!!!");
			long startTime = System.currentTimeMillis();		//処理時間計測スタート
			Random rand = new Random();
			int m = 0;
			for (int i = 0; i <= n; i++) {
				double x = 1 - rand.nextDouble();	//0～1.0を発生したいので1から引いた
				double y = 1 - rand.nextDouble();	//nextDouble()は0以上1未満
				double r = Math.pow(x,2) + Math.pow(y,2);	//円の座標
				if(r < 1)			//円の扇の中に入っている数をカウント
					m++;
			}
			System.out.println("Stop!!!!!");
			long endTime = System.currentTimeMillis();		//処理終了
			long time = (long)(endTime - startTime);			//計算時間を差でカウント
			System.out.println("Time = " + time + "ms");
			double pi;
			pi = (4 * (double)(m) / (double)(n));
			System.out.print("pi = " + pi);
			System.out.print("(誤差 = " + (Math.PI - pi) +")"); //誤差なので負も含む
		
	}

}
