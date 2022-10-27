import java.util.Scanner;

public class Test12 {//B - Perfect String 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] c = s.toCharArray();
		
		String result = "Yes";
		int ch = 0;
		a:for(int i = 0; i < c.length-1; i++) {
			if(Character.isUpperCase(c[i])) {
				ch++;
			}else {
				ch--;
			}
			for(int j = i + 1; j < c.length; j++) {
				
				if(c[i]==(c[j])) {
					result = "No";
					break a;
				}
			}
			
		}
		if(Character.isUpperCase(c[c.length-1])) {
			ch++;
		}else {
			ch--;
		}
		if(ch == -c.length || ch == c.length) {
			result = "No";
		}
		System.out.println(result);
	}

}
