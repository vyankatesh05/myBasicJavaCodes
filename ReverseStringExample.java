package basic;
import java.util.*;
public class ReverseStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		String reverse = "";
		
		for(int i=str.length()-1;  i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is: "+reverse);
	}

}
