// 소리 파일 저장용량 계산하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		
		System.out.println(String.format("%.1f", (float)((h*b*c*s)/8)/1024000) + "MB");
	}
}