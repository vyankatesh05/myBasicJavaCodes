package array;

public class ArrayReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50};
		
		//print array elements
		System.out.println("Original Array is: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		
//		System.out.println("reverse: ");
//		for(int i = arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		int start = 0, end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array is: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
