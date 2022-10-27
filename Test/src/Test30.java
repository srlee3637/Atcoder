import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String t = sc.next();
		String[] dir = t.split("");
		
		int x = 0;
		int y = 0;
		int count = 0;
		for(int i = 0; i < t.length(); i++) {
			if(dir[i].equals("R")) {
				count++;
				
			}else {
				if(count % 4 == 0) {
					x++;
				}else if(count % 4 == 1) {
					y--;
				}else if(count % 4 == 2) {
					x--;
				}else if(count % 4 == 3) {
					y++;
				}
			}
			
		}
		
		System.out.println(x + " " + y);
		

	}

}
