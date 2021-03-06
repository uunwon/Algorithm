// 년월일 입력 받아 형식 바꿔 출력하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m, d;
		String date = sc.next();
		String[] dateArray = date.split("\\.");
		
		y = Integer.parseInt(dateArray[0]);
		m = Integer.parseInt(dateArray[1]);
		d = Integer.parseInt(dateArray[2]);
		
		System.out.println(String.format("%02d", d) + "-" + String.format("%02d", m) + "-" + String.format("%04d", y));
	}
}