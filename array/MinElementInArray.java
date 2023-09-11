package array;

public class MinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,7,93,55,12,59,54,35,2465,700};
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[0]<min) {
				min = arr[0];
			}
		}
		System.out.println("Min element is: "+min);
	}

}
