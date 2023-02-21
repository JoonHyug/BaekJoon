import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<N;i++) {
			for(int j=i;j<N;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N;i>0;i--) {
			for(int j=i;j<N;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
