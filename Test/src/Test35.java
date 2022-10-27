import java.util.Scanner;

public class Test35 {//B - Integer Division 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long result = x / 10;
		
		if(x < 0 && x % 10 !=0) {
			result --;
		}
		
		System.out.println(result);
		
	}

}
