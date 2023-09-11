package array;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,7,93,55,12,59,54,35,2465,700};
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		System.out.println("Max elemnt is: "+max);
	}

}
