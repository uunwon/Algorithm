// 바둑알 십자 뒤집기(설명)

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[19][19]; // 바둑판
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++)
				array[i][j] = sc.nextInt();
		}
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			for(int j = 0; j < 19; j++) {
				if(array[x][j] == 0)
					array[x][j] = 1;
				else
					array[x][j] = 0;
			}
			
			for(int j = 0; j < 19; j++) {
				if(array[j][y] == 0)
					array[j][y] = 1;
				else
					array[j][y] = 0;
			}
		}
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++)
				System.out.print(array[i][j] + " ");
			System.out.println("");
		}
		
	}
}