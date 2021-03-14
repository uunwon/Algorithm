// 성실한 개미

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] maze = new int[10][10];
		int fin = 0;
		int temp = 1;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++)
				maze[i][j] = sc.nextInt();
		}
		
		for(int i = 1 ; i < 9; i++) {
			for(int j = temp; j < 9; j++) {
				if(maze[i][j] == 2) {
					maze[i][j] = 9;
					fin = 1;
					break;
				} else if(maze[i][j+1] == 0) {
					maze[i][j] = 9;
				} else if(maze[i][j+1] == 1) {
					maze[i][j] = 9;
					temp = j;
					break;
				}
			}
			if(fin == 1)
				break;
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++)
				System.out.print(maze[i][j] + " ");
			System.out.println(" ");
		}
		
	}
}