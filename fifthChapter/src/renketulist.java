/*
 * 常に要素が昇順に並ぶver
 */

/**
 * 連結リストのセル
 */
class Cell {
	
	Cell next;		//次のセルへのリンク
	Object data;	//このセルが持つデータ
	

	/**
	 * セルを生成
	 */
	
	Cell(Object aData) {
		next = null;
		data = aData;
	}
}



public class renketulist {

	/**
	 * @param args
	 */
	
	
	
	Cell header;	//リストへの頭へのリンク 
	
	/*
	 * 連結リストを生成する
	 * 
	 */
	
	renketulist() {
		header = new Cell("List Head");		//リストの頭
	}
	
	/**
	 * 連結リストに要素numを挿入
	 * 要素は連結リストが昇順になるような場所に挿入される
	 * @param num
	 */
	public void insert(int num) {
		Cell p = header.next;
		Cell q = header;
		while(p != null && num > ((Integer)p.data).intValue()) {
			q = p;
			p = p.next;
		}
	
	//セルの挿入
		Cell newCell = new Cell(new Integer(num));
		newCell.next = p;
		q.next = newCell;
	
	
	}
	/**
	 * イテレータを得る
	 * 
	 * @param この連結リストに対するイテレータ
	 */
	//public renketulistIterator iterator() {
	//	return new renketulistIterator(this);
	//}
	
	public String toString() {
		String s;
		
		s = "{";
		for(Cell p = header.next;p != null; p = p.next) {
			s += p.data + " ";
		}
		s += "}";
		return s;
	}

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		renketulist list = new renketulist();
		
		System.out.println(list);
		list.insert(5);
		System.out.println(list);
		list.insert(7);
		System.out.println(list);
		list.insert(2);
		System.out.println(list);
		list.insert(12);
		System.out.println(list);
		list.insert(4);
		System.out.println(list);

	}

}
