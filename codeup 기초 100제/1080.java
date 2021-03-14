// 언제까지 더해야 할까?

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(sum < num) {
			sum += i;
			i++;
		}
		
		System.out.println(i - 1);
	}
}