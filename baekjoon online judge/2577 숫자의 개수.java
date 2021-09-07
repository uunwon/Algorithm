import java.io.*;

public class Main {
	public static void count_number(int num) {
		int[] arr = new int[10];
		int len = (int)(Math.log10(num) + 1);

		for(int i = 0; i < len; i++) {
			int n = num % 10;
			arr[n]++;
			num /= 10;
		}

		for(int i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int num = Integer.parseInt(br.readLine()) 
				* Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			
			count_number(num);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}