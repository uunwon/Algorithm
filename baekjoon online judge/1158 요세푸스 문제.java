import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> sQueue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int idx = Integer.parseInt(st.nextToken());

		for(int i = 0; i < len; i++)
			sQueue.add(i+1);

		while(!sQueue.isEmpty()) {
			for(int i = 0; i < idx; i++) {
				if(i == (idx - 1))
					sb.append(sQueue.poll() + ", ");
				else
					sQueue.add(sQueue.poll());
			}
		}

		System.out.println(sb.substring(0, sb.length() - 2) + ">");
	}
}