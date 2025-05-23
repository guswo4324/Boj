import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = Integer.MAX_VALUE;
		
		int count = 0;
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N; j++) {
				if(3*i + 5*j == N) {
					count = i + j;
					result = Math.min(result, Math.min(result, count));
				}
			}

		}

		if(count > 0) {
			System.out.println(result);
		}
		else {
			System.out.println(-1);
		}
		br.close();
	}

}
