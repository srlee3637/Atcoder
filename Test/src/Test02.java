import java.util.*;
public class Test02 {// A - good morning

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if(A < C) {
			System.out.println("Takahashi");
		}else if(A > C){
			System.out.println("Aoki");
		}else {
			if(B < D) {
				System.out.println("Takahashi");
			}else {
				System.out.println("Aoki");
			}
			
		}
		
	}

}
