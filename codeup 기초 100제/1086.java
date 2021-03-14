// 그림 파일 저장용량 계산하기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(String.format("%.2f", (double)((w*h*b)/8)/1024/1024) + " MB");
	}
}