/**
 * 
 * 1,5,25￠を用いて（何枚使ってもよい）で例えば42￠のつり銭を
 * 作る場合、つり銭の枚数を最小にする
 * 
 * @author yusuke
 *
 */
public class doutekikeikakuOtsuri {

	//枚数
	public static int limit = 42;
	
	//コインの種類の総数
	public static int n = 3;
	
	public static void main(String[] args) {
		
		int[] size = {1,10,25};	//コイン
		int[] value = new int[limit + 1];	//枚数
		int[] item = new int[limit + 1];	//コインの番号
		int i,s,p,newvalue;
		p=0;
		
		for(s=0;s<=limit;s++)
			value[s] = s;	//初期値

		for(i=0; i<n; i++) {				//コインの番号
			for(s=size[i];s<=limit;s++) {	//サイズ
				p = s-size[i];
				newvalue = value[p] + 1;
				if(newvalue <= value[s]) {
					value[s] = newvalue;	//最適解の更新
					item[s] = i;
				}
			}
		}
		
		System.out.println(" コインの枚数 = " + value[limit]);
		for(s=limit; s>0; s = s-size[item[s]]) {
			System.out.println("	" + size[item[s]]);
		}
		
	}
}
