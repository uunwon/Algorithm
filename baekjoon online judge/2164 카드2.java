import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();

		for(int i = 0; i < num; i++) // 큐에 숫자 넣어주기
			queue.add(i+1);

		while(queue.size() != 1) { // 하나 남을 때까지 돌려
			queue.poll();
			queue.offer(queue.poll());
		}
		
		System.out.println(queue.poll());
	}
}