import java.util.Scanner;

public class Test28 {//A - Seismic magnitude scales 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		
		if(a > b) {
			for(int i = 0; i < a -b; i ++) {
				result *= 32;
			}
		}
		
		System.out.println(result);
	}

}
