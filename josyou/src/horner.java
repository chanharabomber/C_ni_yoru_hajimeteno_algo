//本の応用でlengthによりa_n*x^nに対応した

public class horner {


	public static void main(String[] args) {
		
		double[] a = {6,5,4,3,2,1};
		double x;
		
		for(x=1;x<=5;x++)
			System.out.println("fn(" + x +")=" + fn(x,a,(a.length-1)));
		
	}

	public static double fn(double x,double[] a,int n) {
		
		double p;
		int i;
		
		p=a[0];
		for(i = 1;i<=a.length-1;i++) {
			p = p*x+a[i];
			//System.out.println("p= " + p);
		}
		return p;
	}
}
