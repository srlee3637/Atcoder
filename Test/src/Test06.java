import java.util.Scanner;

public class Test06 {//A - T-shirt

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		double result = 0;
		
		if(x <= a) {
			result = 1;
		}
		
		else if(x > b) {
			result = 0;
			
		}else if(x >a && x <= b) {
			result = (double) c/(b-a);
		}
		
		System.out.println(result);
	}

}
               