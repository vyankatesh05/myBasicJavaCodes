package geeksforgeeks;

public class SwapNumbers2 {

	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		System.out.println("values before swapping m & n are m: "+m+" "+"n: "+n);
		
		SwapNumbers(m,n);
	}
	
	public static void SwapNumbers(int m, int n) {
//		Approach-1
//		 m = m + n;
//		 n = m - n;
//		 m = m - n;
//		 
//		Approach-2		
//		m = m - n;
//		n = m + n;
//		m = n - m;
//	
//		Approach-3
//		m = m ^ n;
//		n = m ^ n;
//		m = m ^ n;
			System.out.println("values after swapping m & n are m: "+m+" "+"n: "+n);
		
		
	}

}
