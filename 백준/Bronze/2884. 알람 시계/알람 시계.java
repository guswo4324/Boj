import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
        if(M<45){
            H--;
            M= 60 - (45 - M);
            if(H<0){
                H=23;
            }
            System.out.print(H + " " + M);
            }
        else{
            System.out.print(H + " " + (M-45));
            }
    }
}	
