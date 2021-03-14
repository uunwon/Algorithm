// 참/거짓이 서로 다를 때에만 참 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a != b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}