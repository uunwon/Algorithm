package javaPractice;
import java.io.*;
import java.util.*;

// ** 별 두 개짜리
// 스택 - **탑, **스택 수열// 덱 - **회전하는 큐, AC
// https://velog.io/@cheal3/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-1926-%EA%B7%B8%EB%A6%BC-%EC%9E%90%EB%B0%94
// https://iseunghan.tistory.com/311

public class code {
	static Queue<Pair> queue;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int N;
	static int M;
	static int map[][];
	static boolean visited[][];
	static int count = 0;
	static int max = 0;

	public static class Pair {
		int x;
		int y;

		public Pair(int x, int y) {
			super();

			this.x = x;
			this.y = y;
		}
	}

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 1 && !visited[i][j])
					bfs(i, j);
			}
		}

		System.out.println(count);
		System.out.println(max);
	}

	public static void bfs(int x, int y) {
		queue = new LinkedList<>();
		queue.add(new Pair(x, y));
		int cnt = 0;

		while(!queue.isEmpty()) {
			Pair pair = queue.poll();
			cnt++;
			for(int dir = 0; dir < 4; dir++) {
				int nx = pair.x + dx[dir];
				int ny = pair.y + dy[dir];

				if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
				if(visited[nx][ny] || map[nx][ny] == 0) continue;

				visited[nx][ny] = true;
				queue.add(new Pair(nx, ny));
			}
		}

		count++;
		if(cnt > 1) cnt--;
		max = Math.max(max, cnt);
	}
}