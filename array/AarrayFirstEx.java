package array;
import java.util.*;
public class AarrayFirstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//basic array declaration
		//syntax = int[] arr = new int[size];
		int[] arr = new int[5];
//		arr[0]=12;
//		arr[1]=22;
//		arr[3]=32;
//		arr[4]=42;
//		
//		System.out.println(arr[4]);
		System.out.println("Accept integer array");
		//To accept array from user
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		//m1- print array 
		System.out.println("Print integer array");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//m2- print array
		for(int num : arr) {	
			System.out.print(num+ " ");
		}
		System.out.println();
		
		//m3- print using toString method
		System.out.println(Arrays.toString(arr));
		
		System.out.println("AcceptString array");
		String[] str = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i]=sc.next();
		}
		
		System.out.println("Print string array");
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
		System.out.print(str[i]+" ");	
		}

		
	}

}
