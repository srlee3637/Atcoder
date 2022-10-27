import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String result ="";
		if(s1.equals(".#") && s2.equals("#.")) {
			result = "No";
		}else if(s1.equals("#.") && s2.equals(".#")) {
			
			result = "No";
		}
		else {
			result = "Yes";
			
		}
		
		System.out.println(result);
	}

}
