import java.util.Scanner;

public class Test24 {//A - Distinct Strings 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int result = 0;
		if(s.charAt(0) == s.charAt(1) && s.charAt(0)== s.charAt(2)) {
			result = 1;
		}else if(s.charAt(0) == s.charAt(1) || s.charAt(0) == s.charAt(2) || s.charAt(1) == s.charAt(2)) {
			result = 3;
		}else {
			result = 6;
		}
		
		System.out.println(result);
		
	}

}
