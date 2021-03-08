// 정수 3개 입력받아 합과 평균 출력하기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a + b + c);
		System.out.println(String.format("%.1f", (float)(a + b + c) / 3));
	}
}