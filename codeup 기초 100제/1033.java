// 10진 정수 입력받아 16진수로 출력하기2(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(String.format("%x", num).toUpperCase());
	}
}