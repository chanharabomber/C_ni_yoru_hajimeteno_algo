
public class mojiretureplacekotonarunagasa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String text = "サルビアのつぼみは白かったそして紅色の空." +
				"---　サルビアの花 " + "いつもいつも思っていた" +
				"紅色のサルビアの花をあなたの部屋に";
		
		String pt = "かすみ";
		text = text.replaceAll("サルビア", pt);
		text = text.replaceAll("紅","白");
		System.out.println(text);
		
	}

}
