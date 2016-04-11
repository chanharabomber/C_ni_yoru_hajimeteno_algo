import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class boyerpractice {

	/**
	 * @param args
	 */
	
	
	static int bmMatch(String txt,String pat) {

		int pt;                        // txtをなぞるカーソル
		int pp;                        // patをなぞるカーソル
		int txt_len = txt.length();   // txtの文字数
		int pat_len = pat.length();   // patの文字数
		int[] skip = new int[Character.MAX_VALUE + 1];   // スキップテーブル
		int count = 0;   // 比較回数
		int k = -1;

		// スキップテーブルの作成
		for (pt = 0; pt <= Character.MAX_VALUE; pt++)
			skip[pt] = pat_len;
		for (pt = 0; pt < pat_len - 1; pt++)
			skip[pat.charAt(pt)] = pat_len - pt - 1;


		//検索

		while(pt < txt_len){

			count++;
			pp = pat_len - 1;
			while(txt.charAt(pt) == pat.charAt(pp)) {

				if(pp==0) 
					return pt;
				pp--;
				pt--;
				
			}
				
			pt = pt + skip[txt.charAt(pt)];
		}

		return -1;

	}

	public static void main(String[] args)  {
		// TODO 自動生成されたメソッド・スタブ


		// char s = ' ';
		// System.out.println("" + (int)s);

		 String str = new String();
		 String str1 = new String();
		
		 try{
			
		      File file = new File("D:\\temp\\test.txt");

		      if (checkBeforeReadfile(file)){
		        BufferedReader br = new BufferedReader(new FileReader(file));

		        //String str;
		        while((str = br.readLine()) != null){
		          System.out.println(str);
		          str1 = new String(str);
		        }
		        
		        br.close();
		      }else{
		        System.out.println("ファイルが見つからないか開けません");
		      }
		    }catch(FileNotFoundException e){
		      System.out.println(e);
		    }catch(IOException e){
		      System.out.println(e);
		    }

		 

		    Scanner stdIn = new Scanner(System.in);
		    System.out.print("パターン：");
		      String s2 = stdIn.next();               // パターン用文字列

		      int idx = bmMatch(str1, s2);

		    System.out.println(" " + (idx + 1));


	}

	private static boolean checkBeforeReadfile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canRead()){
	        return true;
	      }
	    }

	    return false;
	  }
}
