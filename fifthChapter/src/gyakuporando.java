
public class gyakuporando {

	/**
	 * @param args
	 */
	
	public static char[] stack = new char[50];		//一時
	public static char[] polish = new char[50];		//逆ポーランド
	public static int[] pri = new int[256]; 		//優先順位表
	public static int sp1,sp2; 						//スタックポインタ
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i;
		String str = "(a+b)*(c+d)";		//判定したい式
		char[] p = str.toCharArray();	//charの配列へ変換
		
		//優先順位
		for(i=0;i<=255;i++)
			pri[i] = 3;
		
		pri['+'] = pri['-'] = 1;
		pri['*'] = pri['/'] = 2;
		pri['('] = 4;
		pri[')'] = 0;
		
		stack[0] = 0; pri[0] = -1;	//番兵
		
		sp1=sp2=0;
		//charの配列のポインタ
		int charPoint;
		charPoint = 0;
		
		while(charPoint < p.length) {
			/*
			System.out.println();
			System.out.println("pc= " + p[charPoint] + " pripchar= " + pri[p[charPoint]]);
			System.out.println("stack[sp1]=" + stack[sp1] + "pri[stack[sp1]]= " + pri[stack[sp1]]);
			System.out.println("stak= " + stack[sp1]);
			*/
			while((pri[p[charPoint]] <= pri[stack[sp1]]) && (stack[sp1] != '(')) {
				sp2++;
				polish[sp2] = stack[sp1];
				sp1--;
				//System.out.println("polish[sp2]= " + polish[sp2]);
			}
			
			if(p[charPoint] != ')') {
				sp1++;
				stack[sp1] = p[charPoint];
				//System.out.println("charPoint= " + charPoint);
			} else
				sp1--;
			charPoint++;
		}

		
		for(i=sp1;i>0;i--) 
			polish[++sp2] = stack[i];
		
		System.out.println();
		for(i=1;i<=sp2;i++)
			System.out.print("" + polish[i]);
	}

}
