import java.util.Scanner;

public class Test05 {// A - shampoo

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(true) {
			
			v-=a;
			
			if(v < 0) {
				System.out.println("F");
				break;
			}
			v-=b;
			if(v < 0) {
				System.out.println("M");
				break;
			}
			v-=c;
			if(v < 0) {
				System.out.println("T");
				break;
			}
		}
	}

}
