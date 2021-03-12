// 수 나열하기1

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 0; i < n - 1; i++) {
			a += d;
		}
		System.out.println(a);
	}
}