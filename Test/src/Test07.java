import java.util.Scanner;

public class Test07 {//A - Horizon

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		double x = (double) h * (12800000 + h);
		
		
		double result = Math.sqrt(x);
		System.out.println(result);
	}

}
