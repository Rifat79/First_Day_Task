import java.io.*;
import java.util.*;
public class main {
	
	public static void main( String[] args ) throws IOException{
		Scanner input = new Scanner(System.in);
		BufferedReader input_str = new BufferedReader( new InputStreamReader(System.in));
		String line;
		while ( (line = input_str.readLine()) != null ) {
			char[] s = line.toCharArray();
		    for( int i = 0; i < line.length(); i++ ) {
		    	if((s[i]=='A')||(s[i]=='B')||(s[i]=='C'))
		             System.out.printf("%d", 2);
		         else if((s[i]=='D')||(s[i]=='E')||(s[i]=='F'))
		        	 System.out.printf("%d", 3);
		         else if((s[i]=='G')||(s[i]=='H')||(s[i]=='I'))
		        	 System.out.printf("%d", 4);
		         else if((s[i]=='J')||(s[i]=='K')||(s[i]=='L'))
		        	 System.out.printf("%d", 5);
		         else if((s[i]=='M')||(s[i]=='N')||(s[i]=='O'))
		        	 System.out.printf("%d", 6);
		         else if((s[i]=='P')||(s[i]=='Q')||(s[i]=='R')||(s[i]=='S'))
		        	 System.out.printf("%d", 7);
		         else if((s[i]=='T')||(s[i]=='U')||(s[i]=='V'))
		        	 System.out.printf("%d", 8);
		         else if((s[i]=='W')||(s[i]=='X')||(s[i]=='Y')||(s[i]=='Z'))
		        	 System.out.printf("%d", 9);
		         else
		        	 System.out.printf("%c",s[i]);
		    }
		    System.out.println("");
		}
	}
}
