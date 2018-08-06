
import java.util.*;
public class main {
	
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);
		long n, a;
		while(true) {
			n = input.nextLong();
			if( n < 0 ) break;
			
			a = ((n*(n+1))/2) + 1;
			System.out.println(a);
		}
	}
}
