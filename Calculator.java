package basic;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float ans = 0f;
		
		while(true) {
			System.out.println("Enter operator");
			System.out.println();
		char op = in.next().trim().charAt(0);
		if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
			
			System.out.println("Enter two numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		if(op == '+') {
			ans = num1 + num2;
		}
		if(op == '-') {
			ans = num1 - num2;
		}
		if(op == '*') {
			ans = num1 * num2;
		}
		if(op == '/') {
			if(num2 !=0) {
			ans = num1 / num2;
		}
		}
		if(op == '%') {
			ans = num1 % num2;
		}
		else if(op =='x' || op == 'X') {
			break;
		}
		
	  }		else {
			System.out.println("Invalod Operator");
		}
		System.out.println(ans);
	}	
}
}
