package msft3c_symmetric;

import java.io.*;
import java.util.*;

public class moonbox {
	private static Scanner inp;
	public static void main(String[] args) {
		try{
			File f = new File("inp.txt");
			inp = new Scanner(f);
			int max = 0;
			String x = "";
			Map<String, Integer> count = new HashMap<String, Integer>();
			
			while(inp.hasNextLine()){
				String str = inp.nextLine();
				Integer c = count.get(str);

		        if (c != null) {
					if(max <= c){
						x = str;
					}
		            count.put(str, c + 1);
		        } else {
		            count.put(str, 1);
		        }
			}

			System.out.println(x);
			System.out.println(count.get(x));
			
			
			
				inp.close();
			} catch (Exception e){
				e.printStackTrace();
			

			}

	}

}
