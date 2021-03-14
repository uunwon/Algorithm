// 설탕과자 뽑기

package projectJob;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt(); // 격자판의 가로
		int h = sc.nextInt(); // 격자판의 세로
		
		int[][] line = new int[w][h]; // 막대 배열
		int n = sc.nextInt(); // 막대 갯수
		
		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			if(d == 0) { // 가로 막대
				for(int j = 0; j < l; j++) {
					line[x][y++] = 1;
				}
			} else { // 세로 막대
				for(int j = 0; j < l;j++) {
					line[x++][y] = 1;
				}
			}
		}
		
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				System.out.print(line[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}