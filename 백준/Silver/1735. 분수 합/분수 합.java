import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num1 = new int[2];
		int[] num2 = new int[2];
		int[] result1 = new int[2];
		int[] result2 = new int[2];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			num2[i] = Integer.parseInt(st1.nextToken());
		}
		
		result1[0] = num1[0] * num2[1] + num1[1] * num2[0];
		result1[1] = num1[1] * num2[1];
		
		result2[0] = result1[0]/gcd(result1[0], result1[1]);
		result2[1] = result1[1]/gcd(result1[0], result1[1]);
		
		for(int i = 0; i < 2; i++) {
			bw.write(result2[i] + " ");
		}

		br.close();
		bw.flush();
		bw.close();

	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
