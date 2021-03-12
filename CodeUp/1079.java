// 원하는 문자가 입력될 때까지 반복 출력하기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();
		str = str.replaceAll(" ", "");
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'q') 
				break;
			else
				System.out.println(c);
		}
	}
}