// 두 정수 입력받아 비교하기3(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}