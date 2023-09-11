package basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2345;
		int reverse = 0;
		while(n!=0) {
			int rem = n % 10;
			n = n /10;
					
		    reverse = reverse * 10 + rem; 
		
		}
		System.out.println(reverse);
	}

}
