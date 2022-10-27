import java.util.Arrays;
import java.util.Scanner;

public class Test32 {//B - Minimize Ordering

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] str = s.split("");
		
		Arrays.sort(str);
		
		String result = String.join("", str);
		
		System.out.println(result);
	}

}
