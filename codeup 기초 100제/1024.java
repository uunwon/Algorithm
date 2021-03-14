// 단어 1개 입력받아 나누어 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String realnum = sc.next();
		
		for(int i = 0; i < realnum.length() ; i++) {
			System.out.println("\'" + realnum.charAt(i) + "\'");
		}
		
	}
}