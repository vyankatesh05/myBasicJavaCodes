package geeksforgeeks;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		int n = 20;
		System.out.println("Values of m & n before swapping are m: "+m+" "+"n: "+n);
		
		SwapNumbers no = new SwapNumbers();
		no.SwapNumbers(m, n);

	}
	
	public void SwapNumbers(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("values after swapping m & n are m: "+m+" "+"n: "+n);	}

}
