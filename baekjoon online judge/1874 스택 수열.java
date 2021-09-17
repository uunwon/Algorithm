import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		int start = 0;

		while(cnt-- > 0) {
			int num = Integer.parseInt(br.readLine());

			if(start < num) {
				for(int i = start+1; i <= num; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = num;
			}

			else if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}

			stack.pop();
			sb.append("-").append("\n");
		}

		System.out.println(sb);
	}
}