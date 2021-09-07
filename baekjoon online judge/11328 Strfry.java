import java.io.*;
import java.util.*;

public class Main {
	public static void check_string(String word) {
		StringTokenizer st = new StringTokenizer(word);
		char[] frt = st.nextToken().toCharArray();
		char[] scd = st.nextToken().toCharArray();
		
		int[] arr = new int[26];
		boolean flag = true;

		for(char ch : frt) arr[ch - 'a']++;
		for(char ch : scd) arr[ch - 'a']--;

		for(int i : arr)
			if(i != 0) flag = false;
		System.out.println(flag ? "Possible" : "Impossible");
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int num = Integer.parseInt(br.readLine());

			for(int i = 0; i < num; i++)
				check_string(br.readLine());

		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}