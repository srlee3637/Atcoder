import java.util.Scanner;

public class Test13 {//B - Slimes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int k = sc.nextInt();
		
		int result = 0;
		
		while(a < b) {
			
			a *= k;
			result ++;
		}
		
		System.out.println(result);
	}

}
