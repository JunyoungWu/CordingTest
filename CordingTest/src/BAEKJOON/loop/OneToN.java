import java.util.Scanner;
//문제:https://www.acmicpc.net/problem/8393
public class OneToN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i =1 ; i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
