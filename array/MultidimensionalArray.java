package array;
import java.util.*;
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax of 2D array
		//datatype[][] arrayName =new datatype[row][col] ------>enter no of rows and cols		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		
		System.out.println("enter array element: ");
		//Enter values for rows
		for(int row = 0; row < arr.length; row++) {	
			//Enter values for col
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		
		System.out.println("array elements are: ");
		//Print values for rows
		for(int row = 0; row < arr.length; row++) {
			
			//Print values for col
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			//for new line after every row
			System.out.println();
		}
		

		System.out.println("array elements are m2: ");
		//Print values for rows
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		sc.close();
		
	}

}
