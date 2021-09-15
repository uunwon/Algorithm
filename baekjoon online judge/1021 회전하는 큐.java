import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken()); // 큐의 크기
		int cnt = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수
		int answer = 0;

		for(int i = 0; i < len; i++)
			deque.add(i+1);

		StringTokenizer stArray = new StringTokenizer(br.readLine());
		int[] ary = new int[cnt];
		for(int i = 0; i < cnt; i++)
			ary[i] = Integer.parseInt(stArray.nextToken());

		Arrays.sort(ary);
		

		System.out.println(answer);
	}
}