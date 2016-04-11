//is

public class quicksort {

	/**
	 * @param args
	 */
	
	public static int[] a = {41,24,76,11,45,64,21,69,19,36};
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int k;
		int N = a.length;
		quick(a,0,N-1);
		
		for(k=0;k<N;k++)
			System.out.print("  " + a[k]);
					
	}

	public static void quick(int[] a,int left,int right) {
	
		int s,t,i,j;
		i=j=0;
		if(left<right) {
			s=a[(right+left)/2];
			i=left-1;
			j=right+1;
			while(true) {
				while(a[++i]<s);
				while(a[--j]>s);
				if(i>=j)
					break;
				t=a[i];	a[i]=a[j];	a[j]=t;
			}

			quick(a,left,i-1);
			quick(a,j+1,right);
			
		}
		
		
	}
	
	
}
