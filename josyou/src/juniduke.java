
public class juniduke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {56,25,67,88,100,61,55,67,76,56};
		int[] juni;
		juni = new int[a.length];
		
		int i,j;
		
		for(j=0;j < a.length;j++) {
			juni[j] = 1;
			for(i=0;i < a.length;i++) {
				if(a[j] < a[i])
					juni[j]++;
			}
		}
		
		System.out.println("得点  順位");
		for(i=0;i<a.length;i++)
			System.out.println("" + a[i] + "  " + juni[i]);
	}

}
