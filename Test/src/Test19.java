import java.util.Scanner;

public class Test19 {//A - AtCoder Quiz 3 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String result = "";
		for(int i = 1; i <= 54; i++) {
			
			if(i == n) {
				
				if(n < 10) {
					result = "AGC00" + i;
				}else if (n >= 42) {
					result = "AGC0" + (i+1);
				}else {
					result = "AGC0" + i;
				}
			}
		}
		
		System.out.println(result);
	}

}
