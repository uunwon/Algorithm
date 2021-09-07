import java.io.*;
import java.util.*;

public class Main {
	public static void count_pair(int len, String arr, int num) {
		StringTokenizer st = new StringTokenizer(arr);
		int[] ary = new int[len];
		int cnt = 0;
		int start = 0;
		int end = len - 1;

		for(int i = 0; i < len;i++)
			ary[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(ary);

		while(start < end) {
			int sum = ary[start] + ary[end];

			if(sum == num) cnt++;

			if(sum <= num) start++;
			else end--;
		}

		System.out.println(cnt);
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int len = Integer.parseInt(br.readLine());
			String arr = br.readLine();
			int num = Integer.parseInt(br.readLine());

			count_pair(len, arr, num);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}