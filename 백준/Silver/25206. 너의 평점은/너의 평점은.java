import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		double sum = 0;
		double sum1 = 0;
		double result = 0;
		
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken(); //과목
			double grade = Double.parseDouble(st.nextToken()); //3.0
			String score = st.nextToken(); //A+
			if(score.equals("A+")) {
				sum += 4.5*grade;
				sum1 += grade;
			}
			else if(score.equals("A0")) {
				sum += 4.0*grade;
				sum1 += grade;
			}
			else if(score.equals("B+")) {
				sum += 3.5*grade;
				sum1 += grade;
			}
			else if(score.equals("B0")) {
				sum += 3.0*grade;
				sum1 += grade;
			}
			else if(score.equals("C+")) {
				sum += 2.5*grade;
				sum1 += grade;
			}
			else if(score.equals("C0")) {
				sum += 2.0*grade;
				sum1 += grade;
			}
			else if(score.equals("D+")) {
				sum += 1.5*grade;
				sum1 += grade;
			}
			else if(score.equals("D0")) {
				sum += 1.0*grade;
				sum1 += grade;
			}
			else if(score.equals("F")) {
				sum += 0.0*grade;
				sum1 += grade;
			}
			else {
				sum += 0;
			}
		}
		br.close();
		result = sum/sum1;
		System.out.printf("%.6f", result);

	}

}
