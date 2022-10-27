import java.util.Arrays;
import java.util.Scanner;

public class Test34 {//B - Count Distinct Integers 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++ ) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int result = 1;
		for(int i = 0; i < n - 1; i++ ) {
			
			if(num[i] != num[i+1]) {
				result++;
			}
		}
		
		System.out.println(result);
	}

}
