package basic;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234567;
		int noOfDigit=0;
		
		while(number!=0) {
			number/=10;
			noOfDigit++;
		}
		System.out.println(noOfDigit);
	}

}
