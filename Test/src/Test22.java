import java.util.Scanner;

public class Test22 {//A - Last Card 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		
		
		int i = 1;
		int result  = 0;
		while(i < k) {
			
			if(a == n) {
				a = 0;
			}
			a++;
			i++;
			result = a;
		}
		
		System.out.println(result);
	}

}
