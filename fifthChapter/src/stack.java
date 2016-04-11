import java.util.Scanner;


public class stack {

	/**
	 * @param args
	 */
	
	public static int stackSize = 100;
	public static int[] stack = new int[stackSize];
	public static int pointer = 0;
	
	public static void main(String[] args) {
		// TODO 自動生成されiたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String judge = new String();
		
		int d=0;
		
		while((judge.equals("z") || judge.equals("Z")) != true) {
			System.out.print("opcode(i:push),(o:pop),(z:exit) >>> " );
			judge = sc.next();
			if((judge.equals("i") || judge.equals("I")) == true) {
				System.out.print("DATA>>>> ");
				d = sc.nextInt();
				if(push(d) == -1)
					System.out.println("stackはフル");
				
			} else if((judge.equals("o") || judge.equals("O")) == true ) {
				if(pop() == -1)
					System.out.println("stackはカラ");
				else
					System.out.println(" " + stack[pointer]);
			} else {
				System.out.println("そんな操作は無い..");
			}
				
			
		}
		System.out.print("fin" );
		
		
	}

	public static int push(int n) {
		if(pointer < stackSize) {
			stack[pointer] = n;
			pointer++;
			return 0;
		} else
			return -1;
		
	}
	
	public static int pop() {
		if(pointer > 0) {
			pointer--;
			return 0;
		} else
			return -1;
		
	}
	
	
}
