// 이상한 출석 번호 부르기2(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt();
		int array[] = new int[num];
		
		for(int i = 0; i < num; i++) 
			array[i] = sc.nextInt();
		
		for(int i = num - 1;i >= 0; i--)
			System.out.print(array[i] + " ");
	}
}