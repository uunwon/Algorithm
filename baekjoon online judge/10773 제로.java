import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> sStack = new Stack<>();
		int len = Integer.parseInt(br.readLine());
		int sum = 0;

		while(len-- != 0) {
			int num = Integer.parseInt(br.readLine());
			if(num > 0) sStack.add(num);
			else sStack.pop();
		}

		while(!sStack.isEmpty())
			sum += sStack.pop();
		
		System.out.println(sum);
	}
}