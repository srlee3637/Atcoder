import java.util.Scanner;

public class Test31 {//B - Hit and Blow

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];

		int count1 = 0;
		int count2 = 0;

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			
		}

		for(int i = 0; i < n; i++) {

			for(int j = 0; j < n; j++) {
				if(a[i] == b[j]) {
					
					if(i == j) {
						count1++;
					} 
					else {
						count2++;
					}

				}
			}
		}

		
		System.out.println(count1);
		System.out.println(count2);


	}

}
