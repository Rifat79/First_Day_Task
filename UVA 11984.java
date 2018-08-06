
import java.util.*;
public class main {
	
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for( int i = 1; i <= T; i++ ) {
			double f, a, c, d;
			c = input.nextDouble();
			d = input.nextDouble();
			f = 9*c/5+d;
			a = f*5/9;
			System.out.printf("Case %d: %.2f\n", i, a);
		}
	}
}
