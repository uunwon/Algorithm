// 정수 1개 입력받아 카운트다운 출력하기2(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = num; i > 0; i--) {
			System.out.println(i - 1);
		}
	}
}