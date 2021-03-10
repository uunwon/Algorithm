// 정수 1개 입력받아 분석하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
		
		if(num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}