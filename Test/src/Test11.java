import java.util.Scanner;

public class Test11 {//A - Digit Machine
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		int result = 0;
		for(int i =0; i < 10; i++) {
			
			a[i] = sc.nextInt();
		}
		
		result = a[a[a[0]]];
		
		System.out.println(result);
	}
}
