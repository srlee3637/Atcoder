import java.util.Scanner;

public class Test26 {//A - Exact Price 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String result = "";
		
		if(x % 100 == 0 && x != 0) {
			result = "Yes";
		}else {
			result = "No";
		}
		System.out.println(result);
	}

}
