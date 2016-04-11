import java.util.Random;

public class SeikiransuBrnd {

	private double sig,m,x,y;
	
	/**
	 * konsutorakuta
	 */
	
	public SeikiransuBrnd() {
		//System.out.println("初期化");
		this.sig = this.m = 0;
		
	}
	
	public SeikiransuBrnd(double sig,double m) {
		this.sig = sig;
		this.m = m;
		
		Random rand = new Random();
		double r1,r2;
		r1 = rand.nextInt(32767) / 32767.1;
		r2 = rand.nextInt(32767) / 32767.1;
		x = sig * Math.sqrt(-2 * Math.log(r1)) * Math.cos(2 * 3.14159 * r2) + m;
		y = sig * Math.sqrt(-2 * Math.log(r1)) * Math.sin(2 * 3.14159 * r2) + m;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
 }
