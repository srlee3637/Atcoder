import java.util.Scanner;

public class Test37 {//B - Matrix Transposition 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] result = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			
			for(int j = 0; j < w; j++) {
				
				result[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < w; i++) {
			
			for(int j = 0; j < h; j++) {
				
				System.out.print(result[j][i] + " ");
			}
			System.out.println();
		}
		
	}

}
