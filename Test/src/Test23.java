import java.util.Scanner;

public class Test23 {//A - Round decimals 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		
		int result = (int)(Math.round(n));
		System.out.println(result);
	}

}
