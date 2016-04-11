import java.util.Scanner;


public class queue {

	/**
	 * @param args
	 */
	
	public static int queueSize = 100;
	public static int[] queue = new int[queueSize];
	public static int head = 0;
	public static int tail = 0;
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String judge = new String();
		
		int d=0;
		
		while((judge.equals("z") || judge.equals("Z")) != true) {
			System.out.print("opcode(i:push),(o:pop),(z:exit) >>> " );
			judge = sc.next();
			if((judge.equals("i") || judge.equals("I")) == true) {
				System.out.print("DATA>>>> ");
				d = sc.nextInt();
				if(queueIn(d) == -1)
					System.out.println("queueはフル");
				
			} else if((judge.equals("o") || judge.equals("O")) == true ) {
				if(queueOut() == -1)
					System.out.println("queueはカラ");
				else
					System.out.println(" " + queue[head-1]);
			} else {
				System.out.println("そんな操作は無い..");
			}
				
			
		}
		System.out.print("fin" );
		
		
		
	}

	public static int queueIn(int n) {
		if((tail+1) % queueSize != head ) {
			queue[tail] = n;
			tail++;
			tail=tail%queueSize;
			return 0;
		} else
			return -1;
		
	}
	
	public static int queueOut() {
		if(tail != head) {
			head++;
			head=head%queueSize;
			return 0;
		} else
			return -1;
		
	}
	
	
}
