// 짝수 합 구하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);		
	}
}