// 시분초 입력받아 분만 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		String[] timeArray = time.split(":");
		
		System.out.println(timeArray[1]);
		sc.close();
	}
}