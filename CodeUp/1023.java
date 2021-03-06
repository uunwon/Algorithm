// 실수 1개 입력받아 부분별로 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String realnum = sc.next();
		String[] realnumArray = realnum.split("\\.");
		
		System.out.println(realnumArray[0]);
		System.out.println(realnumArray[1]);
	}
}