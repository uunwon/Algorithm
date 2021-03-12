// 빛 섞어 색 만들기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < c; k++) {
					System.out.println(i + " " + j + " " + k);
					num++;
				}
			}
		}
		System.out.println(num);
	}
}