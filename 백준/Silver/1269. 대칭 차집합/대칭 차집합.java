import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			set.add(num);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			set1.add(num);
			
			if(set.contains(num)) {
				set.remove(num);
				set1.remove(num);
			}
		}
		
		List<Integer> list = new ArrayList<>(set);
		List<Integer> list1 = new ArrayList<>(set1);
		
		bw.write((list.size() + list1.size())+ "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}