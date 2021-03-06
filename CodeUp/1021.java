// 단어 1개 입력받아 그대로 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		if(word.length() > 50) {
			System.out.println("입력 길이 제한을 초과하였습니다.");
		} else {
			System.out.println(word);
		}
	
	}
}