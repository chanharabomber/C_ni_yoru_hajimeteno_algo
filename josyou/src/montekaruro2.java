import java.util.Random;


public class montekaruro2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// x^2/4 + y^2 = 1 の面積
		
		int n = (int)(Double.parseDouble(args[0]));
		System.out.println("Start!!!!!");
		long startTime = System.currentTimeMillis();		//処理時間計測スタート
		Random rand = new Random();
		int m = 0;
		
		for (int i = 0; i <= n; i++) {
			double x = 2 - 2 * rand.nextDouble();	//0～2.0を発生したいので2から引いた(厳密には0.00...1は出現できない)
			double y = 1 - rand.nextDouble();	//nextDouble()は0以上1未満
			double r = Math.pow(x,2)/4 + Math.pow(y,2);	//楕円の座標
			if(r <= 1)			//円の扇の中に入っている数をカウント
				m++;
		}
		
		System.out.println("Stop!!!!!");
		long endTime = System.currentTimeMillis();		//処理終了
		int time = (int)(endTime - startTime);			//計算時間を差でカウント
		System.out.println("Time = " + time + "ms");
		double s;
		s = ( 4 * ( (2 * (double)(m)) / (double)(n) ) );
		System.out.print("S = " + s);
		
	}

}
