// 이상한 출석 번호 부르기1(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt();
		int array[] = new int[num];
		
		for(int i = 0; i < num; i++) 
			array[i] = sc.nextInt();
		
		for(int i = 1;i <= 23; i++) {
			int k = 0;
			
			for(int j = 0; j < num; j++) {
				if(array[j] == i) 
					k++;
			}
			System.out.print(k + " ");
		}
	}
}