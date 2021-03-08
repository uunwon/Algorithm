// 정수 입력받아 아스키 문자로 출력하기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		char c = (char)num;
		
		System.out.println(c);
	}
}