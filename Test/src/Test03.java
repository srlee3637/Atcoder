import java.util.Scanner;

public class Test03 {//A - Four Points

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력 하세요> ");
		String row1 = sc.nextLine();
		String row2 = sc.nextLine();
		String row3 = sc.nextLine();
		int x4 = 0;
		int y4 = 0;
		
		
		int x1 = Integer.parseInt(row1.split(" ")[0]);
		int y1 = Integer.parseInt(row1.split(" ")[1]);
		
		int x2 = Integer.parseInt(row2.split(" ")[0]);
		int y2 = Integer.parseInt(row2.split(" ")[1]);
		
		int x3 = Integer.parseInt(row3.split(" ")[0]);
		int y3 = Integer.parseInt(row3.split(" ")[1]);

		//로직 처리
		//...
		if(x1 == x2) {
			x4 = x3;
		}else if(x1 == x3) {
			x4 = x2;
		}else {
			x4 = x1;
		}
		
		if(y1 == y2) {
			y4 = y3;
		}else if(y1 == y3) {
			y4 = y2;
		}else {
			y4 = y1;
		}
		
		
		//출력
		System.out.println(x4 + " " + y4);
	}
	
}
