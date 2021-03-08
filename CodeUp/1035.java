// 16진 정수 1개 입력받아 8진수로 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next(), 16);
		System.out.println(String.format("%o", num));
	}
}