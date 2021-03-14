// 시간 입력받아 그대로 출력하기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h, m;
		String line = sc.nextLine();
		String[] lineArray = line.split(":");
		
		h = Integer.parseInt(lineArray[0]);
		m = Integer.parseInt(lineArray[1]);
		
		System.out.print(h + ":" + m);
	}
}

// https://codeup.kr/d_thread.php?tid=11072&cid=