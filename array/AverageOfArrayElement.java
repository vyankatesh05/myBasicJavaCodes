package array;

public class AverageOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr = {1,2,3,4,5};
		int [] arr = {5,7,93,55,12,59,54,35,2465,700};
		//int [] arr = {};
		int sum = 0;
		
		if(arr.length==0) {
			System.out.println("Array is empty");
		}
		else {
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		}
		double average = sum / arr.length;
		System.out.println("Average of array element is: "+average);
	}

}
