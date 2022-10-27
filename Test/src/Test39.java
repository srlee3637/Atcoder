import java.util.Scanner;

public class Test39 {//C - Just K  

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		String result = "Yes";
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		 
		for(int i = 0; i < n - 1; i++) {
			
			if((int)Math.abs(a[i] - a[i+1]) > k &&(int)Math.abs(a[i] - b[i+1]) > k) {
				result = "No";
			}
			
		}
		
		System.out.println(result);
	}

}
