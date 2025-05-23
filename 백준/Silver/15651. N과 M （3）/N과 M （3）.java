import java.io.*;
import java.util.*;

public class Main {
	
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(N, M, 0);
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			dfs(N, M, depth + 1);
	
		}
	}

}