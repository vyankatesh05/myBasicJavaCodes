package basic;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int result = 1;
		for(int i =1; i<=number ; i++) {
			result = result*i;
		}
		System.out.println("factorial of number is: "+result);

	}

}
