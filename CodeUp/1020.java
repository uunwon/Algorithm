// 주민번호 입력받아 형태 바꿔 출력하기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		String[] numArray = num.split("-");
		
		System.out.println(numArray[0] + numArray[1]);
	
	}
}