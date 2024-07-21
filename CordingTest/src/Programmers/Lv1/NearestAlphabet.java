
public class NearestAlphabet {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/142086
	public static void main(String[] args) {

		String s = "banana";
		int[] answer = solution(s);
		for (int data : answer) {
			System.out.println(data);
		}

	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (i != 0) {
				int idx = s.substring(0, i).lastIndexOf(s.charAt(i)); // i번쨰 분자앞까지 분리한 문자열과 s의 i번째 문자 비교해 위치를 찾는다
				if (idx != -1) { // 없으면 -1이다.
					answer[i] = i - idx;

				} else {
					answer[i] = idx; // 있으면 위치 차이 만큼의 숫자 대입
				}
			} else {
				answer[i] = -1; // 0일때는 -1
			}
		}

		return answer;
	}
}
