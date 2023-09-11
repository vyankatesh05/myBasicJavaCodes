package array;

import java.util.Arrays;

public class AarrayPassingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb = {1,2,3,4,5};
		System.out.println(Arrays.toString(numb));
		change(numb);
		System.out.println(Arrays.toString(numb));
		
	}
	static void change(int[] arr) {
		arr[0] = 11;
	}

}
