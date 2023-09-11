package basic;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//m1
//		int max = a;		
//		if(b > max) {
//			//b = max;
//			max = b;
//		}
//		if( c > max) {
//		//c = max;
//			max = c;
//		}
//		 System.out.println(max);
	
		//m2
//		int max =0;
//		if(a>b) {
//			max = a;
//		}
//		else if(b>c) {
//			max = b;
//		}
//		else {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		int max = Math.max(c , Math.max(a, b));
		System.out.println(max);
		sc.close();
	}

}
