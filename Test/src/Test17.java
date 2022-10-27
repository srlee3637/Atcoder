import java.util.*;
public class Test17 {//A - QQ solver

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//3자리 문자열 숫자 x 숫자 
		
		int result = (int)(s.charAt(0)-'0') * (int)(s.charAt(2)-'0'); // 결과 값 숫자 x 숫자 
		System.out.println(result);
	}

}
