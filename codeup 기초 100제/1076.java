// 문자 1개 입력받아 알파벳 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = str.charAt(0);

		for(char i = 'a'; i <= c; i++) {
			System.out.print(i + " ");
		}
	}
}