import java.util.Scanner;

public class Test09 {//A - chukodai

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s = sc.nextLine();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String temp = "";
		String[] str = s.split("");
		temp = str[b-1];
		str[b-1] = str[c-1];
		str[c-1] = temp;
		
		s = String.join("", str);
		
		System.out.println(s);
	
		
	}

}
