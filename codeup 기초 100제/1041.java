// 문자 1개 입력받아 다음 문자 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.nextLine().charAt(0);
		int num = (int) (c + 1);
		c = (char) num;
		
		System.out.println(c);
	}
}