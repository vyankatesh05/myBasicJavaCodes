package array;

import java.util.Arrays;

public class SwapArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1 , 4, 5, 9, 14, 6, 2, 11};
		System.out.println("Array before swapping"+ Arrays.toString(arr));
		swap(arr, 1, 6);
		System.out.println("Array after swapping"+ Arrays.toString(arr));
	}

		static void swap(int[] arr, int index1, int index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
}
