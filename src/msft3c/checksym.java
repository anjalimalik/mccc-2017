package msft3c_symmetric;
import java.util.*;
import java.io.*;
import java.lang.*;

public class checksym {
	
	private static Scanner inp;

	public static void main(String[] args) {
		
		try{
			File f = new File("Matrix-Symmetry_InputForSubmission_1.txt");
			inp = new Scanner(f);

			while(inp.hasNextLine()){
				String str = inp.nextLine();
				String tmp = str;
				//String t;
				int i = 1;
				int j = 1;
				
				
				int index = str.indexOf(';');
				int cols = 0;
				int rows = (tmp.length() - tmp.replaceAll(";", "").length()) + 1;
				tmp = str.substring(0, index);
				//System.out.println(tmp);
				List<String> result = Arrays.asList(tmp.split("\\s*,\\s*"));
				cols = result.size();

				int matrix[][] = new int[rows][cols];
				int check = 1;
			
				
				if(rows != cols){
					System.out.println("Not symmetric");
					return;
				}
				
				
				for(i = 0;i < rows;i++){
					String[] r = str.split(";");
					String[] c = r[i].split(",");
					for(j = 0; j < cols; j++){
						
						matrix[i][j] = Integer.parseInt(c[j]);
						//System.out.println(tmp);
					}
				}
	            for (i = 0; i < rows; i++){
	                for (j = 0; j < cols; j++){
	                    if(matrix[i][j] != matrix[j][i]){
	                        check = 0;
	                    }
	                }
	            }
	            
	            if(check == 1){
	            	System.out.println("Symmetric");
	            } else if (check == 0){
	            	System.out.println("Not symmetric");
	            }

			}
			inp.close();
		} catch (Exception e){
			e.printStackTrace();
		

		}
	}
}
