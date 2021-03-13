// 바둑판에 흰 돌 놓기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int[][] array = new int[20][20];
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			array[x - 1][y - 1] = 1;
		}
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) 
				System.out.print(array[i][j] + " ");
			System.out.println("");
		}
		
	}
}