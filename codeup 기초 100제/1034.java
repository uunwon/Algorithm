// 8진 정수 1개 입력받아 10진수로 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Integer.parseInt(String s, int radix)
		// 숫자형의 문자열을 첫번째 인자값으로 받고 변환할 진수 값 입력 시
		// 해당 진수에 맞춰 Integer 형으로 변환시켜줌
		
		int num = Integer.parseInt(sc.next(), 8);
		System.out.println(num);
	}
}