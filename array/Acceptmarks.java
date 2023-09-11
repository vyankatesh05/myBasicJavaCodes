
package array;
import java.util.*;
public class Acceptmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no element t0 be print");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter element");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
