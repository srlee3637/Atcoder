import java.util.Arrays;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		String[] t = new String[n];
		String result = "Yes";
		boolean bool1 = false;
		boolean bool2 = false;

		
		
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			t[i] = sc.next();

		}
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		a:for(int i = 0; i < n - 1; i++) {

			for(int j = i + 1; j < n; j++) {

				if((s[i].equals(s[j])||s[i].equals(t[j]))) {
					
					bool1 = true;
				}
				if((t[i].equals(t[j]) || t[i].equals(s[j]))) {

					
					bool2 =true;
				}

			}
		}

		if(bool1 && bool2) {
			result = "No";
		}
		System.out.println(result);

	}
}
