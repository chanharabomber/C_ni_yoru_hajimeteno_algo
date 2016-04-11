
public class gyakuporandoParse {

	/**
	 * @param args
	 */
	
	public static char[] stack = new char[50];		//一時
	public static char[] polish = new char[50];		//逆ポーランド
	public static int[] pri = new int[256]; 		//優先順位表
	public static int sp1,sp2; 						//スタックポインタ
	public static double[] v = new double[50];
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int i;
		String str = "(6+3)/(6-2)+3*2^3-1";		//判定したい式
		char[] p = str.toCharArray();	//charの配列へ変換
		
		//優先順位
		for(i=0;i<=255;i++)
			pri[i] = 4;
		
		pri['+'] = pri['-'] = 1;
		pri['*'] = pri['/'] = 2;
		pri['^'] = 3;
		pri['('] = 5;
		pri[')'] = 0;
		
		stack[0] = 0; pri[0] = -1;	//番兵
		
		sp1=sp2=0;
		//charの配列のポインタ
		int charPoint;
		charPoint = 0;
		while(charPoint < p.length) {

			while((pri[p[charPoint]] <= pri[stack[sp1]]) && (stack[sp1] != '(')) {
				sp2++;
				polish[sp2] = stack[sp1];
				sp1--;
			}
			
			if(p[charPoint] != ')') {
				sp1++;
				stack[sp1] = p[charPoint];
			} else
				sp1--;
			charPoint++;
		}

		
		for(i=sp1;i>0;i--) 
			polish[++sp2] = stack[i];
		
		sp1=0;	//式の計算
		for(i=1;i<=sp2;i++) {
			if('0'<= polish[i] && polish[i] < '9')
				v[++sp1] = polish[i] - '0';
			else {
				switch(polish[i]) {
				case '+':v[sp1-1] = v[sp1-1] + v[sp1]; break;
				case '-':v[sp1-1] = v[sp1-1] - v[sp1]; break;
				case '*':v[sp1-1] = v[sp1-1] * v[sp1]; break;
				case '/':v[sp1-1] = v[sp1-1] / v[sp1]; break;
				case '^':v[sp1-1] = Math.pow(v[sp1-1],v[sp1]); break;
				}
				sp1--;
			}
		}
		
		System.out.println("" + str +" = " + v[1]);
	}

}
