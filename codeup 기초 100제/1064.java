// 정수 3개 입력받아 가장 작은 수 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a > b ? b : a) > c ? c : (a > b ? b : a));
	}
}