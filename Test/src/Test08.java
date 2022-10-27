import java.util.Scanner;

public class Test08 {//A - Not Overflow

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		
		if(n >= -2147483648 && n <= 2147483647) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
