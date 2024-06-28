import java.util.Scanner;
//문제:  https://www.acmicpc.net/problem/2739
public class Gugudan {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int answer = scan.nextInt();
		solution(answer);

	}
	
	public static void solution (int num) {
	    for(int i =1 ; i<=9 ;i++){
	        System.out.println(num+" * "+i+" = " +num*i);
	    }
	}
}	
