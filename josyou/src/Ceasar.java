
public class Ceasar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char[] table = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','?'}; 
		String ango = "KSOIDHEPZ";
		
		//System.out.println("" +(int)'A' + "" + (int)'Z');
		
		for(int i=0;i<=26;i++) {
			System.out.println("i=" +i);
			for(int j=0;j<ango.length();j++) {
				if((int)(ango.charAt(j) + i) >= 65 && (int)(ango.charAt(j) + i) <= 90)
					System.out.print(table[(int)(ango.charAt(j) + i - 65)]);
				if((int)(ango.charAt(j) + i) > 90)
					System.out.print(table[(int)(ango.charAt(j) + i - 26 - 65)]);
			}
			System.out.println();
		}
		
	}
}
