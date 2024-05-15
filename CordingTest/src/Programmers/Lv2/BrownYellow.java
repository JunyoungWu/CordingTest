
public class BrownYellow {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/42842
		System.out.println(solution(24, 24)[0]);
		System.out.println(solution(24, 24)[1]);
	}

	public static int[] solution(int brown, int yellow) {
		int range = brown + yellow;
		int width = 0;
		int height = 0;
		for (int i = 1; i <= range; i++) {
			//첫번쨰 조건 넓이의 약수이며, 2보다큰 i를 걸러낸다 
			if (range % i == 0 && i > 2) {
				//두번째 조건 i가 가로가 될 예정이므로 세로가될 range/i i는 크거나 같아야 한다 세로또한 2보다 커야한다 
				if (i >= range / i && range / i > 2) {
					for (int j = 1; j <= yellow; j++) {
						//세번째 조건 yellow 가로보다 양쪽으로 한칸 씩 더많아야 하므로 yellow의 약수보다 +2인 경우를 채택한다 
						if (yellow % j == 0 && i == j + 2) {
							width = i;
							height = range / i;

						}
					}

				}
			}
		}
		int[] answer = { width, height };
		return answer;
	}
}
