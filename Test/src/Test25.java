import java.util.Scanner;

public class Test25 {//A - Tires 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result ="";
		if(s.charAt(s.length()-2) == 'e' && s.charAt(s.length()-1) == 'r'){
			result  = "er";
		}else if(s.charAt(s.length()-3) == 'i' && s.charAt(s.length()-2) == 's' && s.charAt(s.length()-1) == 't') {
			result = "ist";
		}
		
		System.out.println(result);
	}

}
