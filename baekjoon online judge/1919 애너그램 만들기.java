import java.io.*;

public class Main {
	public static void check_string(char[] word, char[] word2) {
		int[] arr = new int[26];
		int cnt = 0;

		for(char ch : word) arr[ch - 'a']++;
		for(char ch : word2) arr[ch - 'a']--;

		for(int i : arr)
			cnt = cnt + Math.abs(i);

		System.out.println(cnt);
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			check_string(br.readLine().toCharArray(), br.readLine().toCharArray());
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}