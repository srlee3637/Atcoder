import java.util.Scanner;

public class Test21 {//A - On and Off 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int t = sc.nextInt();
		int x = sc.nextInt();
		
		String result ="";
		
		if(s < t) {
			if(x >= s && x < t) {
				
				result = "Yes";
			}else {
				result = "No";
			}
		}else {
			if(x >= t && x <s) {
				result = "No";
			}else {
				result = "Yes";
			}
		}
		
		System.out.println(result);
	}

}
