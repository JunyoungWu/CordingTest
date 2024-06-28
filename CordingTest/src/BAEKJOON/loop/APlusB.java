import java.util.Scanner;
// 문제 : https://www.acmicpc.net/problem/10950
public class APlusB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();		//임의의 T를 정한다
		int[] arr = new int[T];		//T만큼의 길이를 가진 int 배열 선언
		for (int i = 0; i < T; i++) {		//T번 반복하는 반복문 

			int A = scan.nextInt();			//A,B를 정한다
			int B = scan.nextInt();
			arr[i] = A + B;					//각 배열의 자리에 A+B를 하나씩 넣어준다

		}
		for (int data : arr) {				//배열을 돌면서 각 요소들 출력 
			System.out.println(data);
		}

	}

}