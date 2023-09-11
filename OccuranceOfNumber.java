package basic;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4551265;
		int count = 0;
		
		while(n>0) {
			int rem = n % 10;
			if(rem==5) {
				count++;
			}
			
			n = n / 10;
		}
		System.out.println(count);
	}

}
