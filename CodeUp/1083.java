// 3 6 9 게임의 왕이 되자!(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i ++) {
			if(i % 3 == 0)
				System.out.print("X ");
			else
				System.out.print(i + " ");
		}
	}
}