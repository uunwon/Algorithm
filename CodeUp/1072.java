// 정수 입력받아 계속 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			System.out.println(sc.nextInt());
		}
	}
}