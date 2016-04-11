
public class marge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] a = {2,4,5,7,8,10,15,20,30,40};
		int[] b = {6,11,25,33,35};
		int M,N;
		M = a.length;
		N = b.length;
		int[] c = new int[M+N];
		int i,j,p;
		i=j=p=0;
		
		//a,bともに終わりでない間
		while(i<M && j<N) {
			if(a[i]<=b[j])
				c[p++] = a[i++];
			else
				c[p++] = b[j++];
		}
		
		
		while(i<M)					//aが終わるまで(aの配列の方がbよりも長い場合)
			c[p++] = a[i++];
		
		while(j<N)					//bが終わるまで
			c[p++] = b[j++];
		
		for(i=0;i<M+N;i++)
			System.out.print(" " + c[i]);
	}

}
