import java.util.*;
public class Test16 {//A - 10yen Stamp
	//최종 우표 금액이 기존 붙어 있는 것보다 높을 때 부족한 금액 10엔으로 몇개 채울 수 있는지 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 기존 붙어있는 우표 가격
		int y = sc.nextInt(); // 최종 우표 붙은 금액 
		
		int result = 0; // 결과 값 받아줄 변수
		
		if(x < y) {
			
			if(((y - x) % 10) == 0) {
				result = (y - x) / 10; 
			}else {
				result = (y - x) / 10  + 1;
			}
			
		}else {
			result = 0;
		}
		
		
		System.out.println(result);
	}

}
