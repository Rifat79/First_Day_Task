package Attachment;
import java.util.*;

public class main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true) {
			long a, b;
			a = input.nextLong();
			b = input.nextLong();
			if(a==0 && b==0)break;
			
			int ans = 0;
			long aa = Math.max(a, b);
			long bb = Math.min(a, b);
			int c = 0;
			while(aa != 0) {
				if( (aa%10 + bb %10 + c) >= 10 ){ ans++; c = 1;}
				else c = 0;
				aa /= 10;
				bb /= 10;
			}
			if(ans == 0) 
				System.out.println("No carry operation.");
			else if(ans == 1)
				System.out.printf("%d carry operation.\n", ans);
			else 
				System.out.printf("%d carry operations.\n", ans);
		}
	}
}
