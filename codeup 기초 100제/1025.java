// 정수 1개 입력받아 나누어 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String realnum = sc.next();
		int length = realnum.length();
		
		if(length > 5) {
			System.out.println("입력 조건을 초과하였습니다.");
		} else {
			for(int i = 0; i < length ; i++) {
				System.out.print("[" + realnum.charAt(i));
				
				for (int j = 0; j < length - (i + 1) ; j++) {
					System.out.print("0");
				}
				
				System.out.println("]");
			}
		}
		
	}
}