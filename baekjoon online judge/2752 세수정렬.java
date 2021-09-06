import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] answer;

		try {
			answer = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for(int i = 0; i < 3; i++)
				answer[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(answer);

			for(int i = 0; i < 3; i++)
				System.out.print(answer[i] + " ");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}