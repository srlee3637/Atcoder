import java.util.Scanner;

public class Test04 {// A - Jogging

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ta = 0;
		int ao = 0;
		
		
		int a = sc.nextInt(); // 타카시 걷는 시간
		int b = sc.nextInt(); // 타카시 속도
		int c = sc.nextInt(); // 타카시 쉬는 시간
		int d = sc.nextInt(); // 아오키 걷는 시간
		int e = sc.nextInt(); // 아오키 속도
		int f = sc.nextInt(); // 아오키 쉬는 시간
		int x = sc.nextInt(); // 총 시간
		
		if(a + c >= x) { // 타카시 걷는 시간 +  타카시 쉬는 시간이 총시간 보다 클 때 
			//타카시는 한번만 걸어갈 수 있음 
			ta = a * b;
		}else {// 타카시 걷는 시간(4초) +  타카시 쉬는 시간(3초)이 총시간 보다 작을 때 
			// 타카시 걷는 시간 + 쉬는 시간이 하나로 뭉쳐져서 7초동안 12미터 갈 수 있음(초당 3미터 일 때)
			// 만약 50초 동안 갈 수 있으면 7초 동안 7번 갈 수 있고, 남은 초동안 초당 3미터 더 갈 수 있음
			// 50 /7 = 7 * 12(이게 총 한 루틴당 갈 수 있는 거리) + 남은 초 1초 * 초당 속도 3 총 87
			ta = a * b *(x /(a + c)) ;
			
			if(x % (a+c)  <= a) {
				ta += (x % (a+c)) * b;
			}else {
				ta += ((x % (a+c)) -((x % (a+c)) % a)) * b;
			}
		}
		if(d + f >= x ) {
			ao = d * e;
		}else {
			ao = d * e *(x /(d + f));
			if(x % (d + f)  <= d) {
				ao += (x % (d + f)) * e;
			}else {
				ao += ((x % (d + f)) -((x % (d + f)) % d)) * b;
			}
			
		}
		System.out.println(ta);
		if(ta > ao) {
			System.out.println("Takahashi");
		}else if(ta < ao) {
			System.out.println("Aoki");
		}else {
			System.out.println("Draw");
		}
	}

}
