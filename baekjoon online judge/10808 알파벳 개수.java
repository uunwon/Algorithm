import java.io.*;

public class Main {
	public static void divide_alphabet(String word) {
		for(int i = 'a'; i <= 'z' ; i++) {
			int temp = 0;
			for(int j = 0; j < word.length(); j++) {
				if(i == word.charAt(j))
					temp++;
			}
			System.out.print(temp + " ");
		}
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			divide_alphabet(br.readLine().toString());
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}