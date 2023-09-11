package geeksforgeeks;

public class LargestOfThree {
	
	public static int biggestElement(int x , int y , int z) {
		if(x > y && x > z) 
			return x;
		
		else if(y > x && y > z ) 
			return y;
		
		else 
			return z;
		
	} 

	public static void main(String[] args) {
		int x = 10 , y= 30, z= 20;
		int number = biggestElement(x, y, z);
		System.out.println("Largest element among 3 is: "+ number);
	}

}
