import java.util.*;
import java.io.*;
import java.lang.*;

public class varanagram {

	private static Scanner inp;

	public static void main(String[] args) {

		try{
			File f = new File("inp.txt");
			inp = new Scanner(f);

			while(inp.hasNextLine()){
				String str = inp.nextLine();
				str = str.replaceAll("\\s+", "");
				str = str.toLowerCase();
				int x = str.indexOf('"', 1);
				String[] w = new String[2];
				w[0] = str.substring(1, x);
				int y = str.indexOf('"', (x+1));
				w[1] = str.substring((y+1), (str.length()-1));	
				
				System.out.println(w[0]+ " " + w[1]);
			}
			inp.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	
	}

}
