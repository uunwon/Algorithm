// 0 입력될 때까지 무한 출력하기1(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (sc.hasNext()) {
			num = sc.nextInt();
			if(num == 0)
				break;
			System.out.println(num);
		}
		
	}
}