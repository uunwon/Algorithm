// 정수 1개 입력받아 평가 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num >= 90 && num <= 100) {
			System.out.println("A");
		} else if (num >= 70 && num < 90) {
			System.out.println("B");
		} else if (num >= 40 && num < 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}