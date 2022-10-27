import java.util.Arrays;
import java.util.Scanner;

public class Test33 {//B - Pasta 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] pasta = new int[n];
		int[] eat = new int[m];
		String result = "";
		
		boolean[] ch = new boolean[n];
		int count = 0;

		for(int i = 0; i < n; i++) {
			pasta[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			eat[i] = sc.nextInt();
		}

		a:for(int i = 0; i < m; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(eat[i] == pasta[j] && !ch[j]) {
					ch[j] = true;
					count++;
					continue a;
				}
				
			}
		}
		if(count == m) {
			result = "Yes";
		}else {
			result = "No";
		}


		System.out.println(result);

	}

}
