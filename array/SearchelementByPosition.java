package array;

public class SearchelementByPosition {
		static int searchElement(int arr[], int n, int key) {
			for(int i = 0; i<n;i++) 
				if(arr[i]==key)
					return i;
				return -1;
		
		}			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10, 20, 30, 40, 50};
		int key = 90;
		int n = arr.length;
		
		
		int position = searchElement(arr, n, key);
		if(position==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at position: "+(position+1));
		}
		
		}

	

}
