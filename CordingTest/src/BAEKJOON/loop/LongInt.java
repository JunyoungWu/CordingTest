import java.util.Scanner;
//문제 : https://www.acmicpc.net/problem/25314
public class LongInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();					//N바이트 선언
		int length = N / 4;						//4로 나눈 만큼 반복할예정
		
		
		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				System.out.print("long int");	//마지막에만 long int를 출력해주면 된다 
			} else {
				System.out.print("long ");		//보통 long 만 출력
			}

		}
	}

}
