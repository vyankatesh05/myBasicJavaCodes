package array;
import java.util.*;
public class MarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of students: ");
		int n = sc.nextInt();
		System.out.println("There are "+n+" student(s)");
		
		System.out.println("Enter marks of 5 subject of Student1: ");
		//int s1 = sc.nextInt();
		int stu1[] = new int[5];
		for(int i=0; i<5; i++) {
			stu1[i]=sc.nextInt();
		}
		System.out.println("Marks of student 1: ");
		for(int i = 0; i<5; i++) {
			System.out.println(stu1[i]);
		}
		
		System.out.println("Enter marks of 5 subject of Student2: ");
		//int s1 = sc.nextInt();
		int stu2[] = new int[5];
		for(int i=0; i<5; i++) {
			stu2[i]=sc.nextInt();
		}
		System.out.println("Marks of student 2: ");
		for(int i = 0; i<5; i++) {
			System.out.println(stu2[i]);
		}
	}

}
