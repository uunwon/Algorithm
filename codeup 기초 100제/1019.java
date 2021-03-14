// 연월일 입력받아 그대로 출력하기

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
		
		System.out.print(y + "." + String.format("%02d", m) + "." + String.format("%02d", d));
		
	}
}
