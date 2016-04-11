import java.util.Scanner;

public class heapEasyVer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		int heap[] = new int[100];
		int n,i,s,p,w;
		
		n=1;
		int judge = 1;
		while(judge == 1) {
			
			System.out.println("input num");
			heap[n] = sc.nextInt();	//heapの最後に入れる
			s = n;
			p = s/2;	//親の位置
			while(s >= 2 && heap[p]> heap[s]) {					//上方移動
				w = heap[p]; heap[p] = heap[s]; heap[s] = w;
				s = p; p = s/2;
			}
			n++;
			
			System.out.println("continue?:if 1,continue");
			judge = sc.nextInt();
		}
		
		for(i=1;i<n;i++)
			System.out.print(" " + heap[i]);
	}

}
