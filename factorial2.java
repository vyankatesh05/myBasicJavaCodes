package basic;

public class factorial2 {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int result = factorial(n);
		System.out.println("Factoral of "+n+" is "+result);

	}

}
