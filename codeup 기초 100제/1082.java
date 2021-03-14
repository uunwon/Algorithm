// 16진수 구구단?

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt(16);
		
		for(int i = 1; i <= 15; i ++) {
			System.out.printf("%X*%X=%X \n", num, i, num*i);
		}
	}
}