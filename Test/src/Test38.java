import java.util.Arrays;
import java.util.Scanner;

public class Test38 {//B - Who is missing? 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] card = new int[4*n -1];
		
		for(int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		
		Arrays.sort(card);
		
		int i = 0;
		while(true) {
			
			if(i+3 > card.length-1) {
				System.out.println(card[i]);
				break;
			}
			
			else if(card[i] != card[i+3] ) {
				System.out.println(card[i]);
				break;
			}
			
			i+=4;
		}
		
		

	}

}
