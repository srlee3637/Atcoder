import java.util.Scanner;

public class Test15 {//2일차 A - Weird Function 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 t 
		int t = sc.nextInt();
		int result = f(f(f(t)+t)+f(f(t)));
		
		System.out.println(result);
	}
	//함수 f = x^2 + 2x + 3;
	public static int f(int a) {
		int ans = 0;
		ans = a * a + 2 * a + 3; 
		
		return ans;
	}

}
