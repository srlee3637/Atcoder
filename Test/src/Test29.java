import java.util.*;
public class Test29 {//B - Get Closer 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double resultA = 0;
		double resultB = 0;
		
		resultA = a / Math.sqrt(a * a + b * b); 
		resultB = b / Math.sqrt(a * a + b * b); 
		
		System.out.println(resultA + " " + resultB);
	}

}
