package Attachment;
import java.util.*;

public class main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t, n;
		
		t = input.nextInt();
		for( int i = 1; i <= t; i++ ){
			n = input.nextInt();
			int k = n, sum = 0;
			int flag; flag = 0;
			for( int j = 1; j <= 30; j++ ){
				while(n!=0){
					sum += Math.pow(n%10, j);
					n /= 10;
				}
				if( sum == k ){
					System.out.println("Armstrong");
					flag = 1;
					break;
				}
					
				n = k; sum = 0;
			}
			if(flag == 0)System.out.println("Not Armstrong");
		}
	}
}
