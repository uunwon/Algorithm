// 이상한 출석 번호 부르기3(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int num = sc.nextInt();
		int array[] = new int[num];
		int temp = 0;
		
		for(int i = 0; i < num; i++) 
			array[i] = sc.nextInt();
		
		temp = array[0];
		
		for(int i = 0; i < num; i++) {
			if(array[i] < temp)
				temp = array[i];
		}
		
		System.out.println(temp);
	}
}