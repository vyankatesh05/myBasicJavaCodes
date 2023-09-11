package array;

public class ArrayReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50};
		System.out.println("Original array is: ");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

//		int start = 0, end = arr.length-1;
//		
//		while(start<end)
//		{
//			int temp = arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++; //if start++ is commented o/p =20 30 40 50 10 
//			end--;  ////if end-- is commented o/p =50 10 20 30 40 
//		}
//		System.out.println();
//		System.out.println("Array reverse is: ");
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.println("\nReverse is:");
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
