package array;

public class SecondLargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50};
		int largest = arr[0];
		int  secondLargest = arr[0];
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]>largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i]!=secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second larest element is: "+secondLargest);
	}

}
