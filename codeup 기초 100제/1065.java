// 정수 3개 입력받아 짝수만 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[3];
		int length = 3;
		
		for(int i = 0; i < length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int j = 0; j < num.length; j++) {
			if(num[j] % 2 == 0) {
				System.out.println(num[j]);
			}
		}
	}
}