// 한 번에 2의 거듭제곱 배로 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a << b);
	}
}