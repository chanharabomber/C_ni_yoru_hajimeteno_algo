

class nap {
	
		String name;	//品名
		int size;		//重さ
		int price;		//価格
		
		
		nap() {
			name= "";
			size= 0;
			price= 0;
		}
		
		nap(String name,int size,int price) {
			this.name= name;
			this.size= size;
			this.price= price;
		}
		
	}


public class doutekikeikaku {


	//ナップザックの重量制限値
	public static int limit = 8;
	//品物の種類
	public static int n = 5;
	//重さの最小値
	public static int min = 1;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		nap[] nap = new nap[5];
		int i;
		
		//クラス配列の初期化
		for(i = 0;i < n; i++) {
			nap[i] = new nap();
		}
		
		nap[0].name = "plum";
		nap[0].size = 4;
		nap[0].price = 4500;
		
		nap[1].name = "apple";
		nap[1].size = 5;
		nap[1].price = 5700;
		
		nap[2].name = "orange";
		nap[2].size = 2;
		nap[2].price = 2250;
		
		nap[3].name = "strawberry";
		nap[3].size = 1;
		nap[3].price = 1100;
		
		nap[4].name = "melon";
		nap[4].size = 6;
		nap[4].price = 6700;
		
		int[] value = new int[limit + 1];
		int[] item = new int[limit + 1];
		int newvalue;
		int s,p;
		
		for(s=0;s<=limit;s++)
			value[s]=0;		//初期値
		
		for(i=0;i<n;i++) {	//品物の番号
			for(s = nap[i].size; s<=limit; s++) {	//なっぷのサイズ
				p=s-nap[i].size;					//空きサイズ
				newvalue = value[p] +nap[i].price;
				if(newvalue > value[s]) {
					value[s] = newvalue;		//最適解の更新
					item[s] = i;
				}
				
			}
		}
		
		System.out.println("	品目	価格");
		for(s=limit; s>=min; s = s-nap[item[s]].size) {
			System.out.println("	" + nap[item[s]].name + "	" + nap[item[s]].price);
		}
		System.out.println("	合計	" + value[limit]);
	}

}
