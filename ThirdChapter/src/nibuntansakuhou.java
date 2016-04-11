import java.util.*;

public class nibuntansakuhou {
	
	
	public static void main(String[] args) {
		
		int[] a = {2,3,7,11,31,50,55,70,77,80};
		int N = a.length;
		int high,low,key,middle;
		middle =0;
		System.out.println("検索するデータを入力してください。");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		
		low = 0;
		high = N-1;
		while(low<=high) {
			middle = (high + low)/2;
			if(a[middle] <= key)
				low = middle + 1;
			if(a[middle] >= key)
				high = middle -1;
		}
		if(low == high + 2)
			System.out.print(" " + a[middle] + " は" + " " + middle + "番目");
	}

}
