import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		while(num-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String com = st.nextToken();

			switch(com) {
				case "push_front" :
					deque.offerFirst(Integer.parseInt(st.nextToken()));
					break;
				case "push_back" :
					deque.offerLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front" : 
					if(!deque.isEmpty()) sb.append(deque.pollFirst()).append("\n");
					else sb.append(-1).append("\n");
					break;
				case "pop_back" :
					if(!deque.isEmpty()) sb.append(deque.pollLast()).append("\n");
					else sb.append(-1).append("\n");
					break;
				case "size" :
					sb.append(deque.size()).append("\n");
					break;
				case "empty" :
					if(!deque.isEmpty()) sb.append(0).append("\n");
					else sb.append(1).append("\n");
					break;
				case "front" :
					if(!deque.isEmpty()) sb.append(deque.peekFirst()).append("\n");
					else sb.append(-1).append("\n");
					break;
				case "back" :
					if(!deque.isEmpty()) sb.append(deque.peekLast()).append("\n");
					else sb.append(-1).append("\n");
					break;
			}
		}
		System.out.println(sb);
	}
}