import java.util.Scanner;

public class Test10 {//A - Rotate
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int abc = sc.nextInt();
		
		int result = 0;
		
		int a = abc/100;
		int b = (abc - a*100) / 10;
		int c = abc % 10;
		
		int bca = b * 100 + c * 10 + a * 1;
		int cab = c * 100 + a * 10 + b * 1;
		
		result = abc + bca + cab;
		
		System.out.println(result);
		
		
	}
}
