package cordingTest;

import java.util.ArrayList;

public class NumberExpress {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(n + " >> " + solution(n));

	}

	public static int solution(int n) {
		int answer = 0;     //답안
		int sum = 0;		// 반복문에서의 합
		int k = 0;			//초기화 시점을 저장하려는 변수 
		for (int i = 1; i <= n; i++) {
			
			if (sum == 0) { //sum이 n이상이 되었을 때, sum은0이되므로 sum이 0일때가 시작 시점이다. 따라서 k에 그떄 i값을 넣어준다 
				k = i;
			}
			
			sum += i;		//1~n까지 순서대로 더해준다 
			
							//n이상일때 i를 k값으로 바꿔주어 다음수부터 다시 시작한다 
			if (sum > n) {
				i = k;
				sum = 0;

			} else if (sum == n) {
				answer++;
				i = k;
				sum = 0;
			}
							//반복문이 끝날때 i는 1늘어나므로 다음숫자로갈수있다 
		}
		return answer;
	}

}
