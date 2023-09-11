//Write a program to find the sum of digits of a number.

package basic;
import java.util.*;
public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		
		while(number > 0) {
			int reminder = number % 10;
			number = number / 10;
			sum = sum + reminder;
			
		}
		System.out.println("Sum  of number is = "+sum);
		sc.close();
	}

}
