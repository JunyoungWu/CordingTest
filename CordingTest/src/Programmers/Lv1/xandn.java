//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class xandn {

	public static void main(String[] args) {
		long [] answer = solution(2, 5);
		for(long data: answer) {
			System.out.println(data);
		}

	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		//x에서 x씩 늘어나는 반복문 생성 
		for (int i = 0; i <= n - 1; i++) {
			answer[i] = (long) x * (i + 1);

		}
		return answer;
	}
}
