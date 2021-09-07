import java.io.*;
import java.util.*;

public class Main {
	public static void find_number(int len, int[] arr, int num) {
		int cnt = 0;
		
		for(int i = 0; i < len; i++) {
			if(num == arr[i]) cnt++;
		}

		System.out.print(cnt);
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int len = Integer.parseInt(br.readLine());
			int[] arr = new int[len];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for(int i = 0; i < len; i++)
				arr[i] = Integer.parseInt(st.nextToken());

			int num = Integer.parseInt(br.readLine());

			find_number(len, arr, num);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}