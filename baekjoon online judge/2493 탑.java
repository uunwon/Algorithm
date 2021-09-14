import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 1; i <= num; i++) {
			int n = Integer.parseInt(st.nextToken());

			while(!stack.empty()) {
				if(stack.peek()[1] < n)
					stack.pop();
				else {
					sb.append(stack.peek()[0]).append(" ");
					break;
				}
			}
			
			if(stack.empty())
				sb.append("0 ");
			
			stack.push(new int[] {i, n});
		}
		
		System.out.println(sb);
	}
}