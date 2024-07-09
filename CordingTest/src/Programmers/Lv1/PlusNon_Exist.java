import java.util.HashSet;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class PlusNon_Exist {
	
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int answer = solution(numbers);
		System.out.println(answer);
	}

	public static int solution(int[] numbers) {
		// 0부터 9까지의 숫자를 HashSet에 저장
		HashSet<Integer> numSet = new HashSet<>();
		for (int i = 0; i <= 9; i++) {
			numSet.add(i);
		}

		// numbers 배열의 숫자를 HashSet에서 제거
		for (int num : numbers) {
			numSet.remove(num);
		}

		// 남아 있는 숫자들을 모두 더하기
		int answer = 0;
		for (int num : numSet) {
			answer += num;
		}

		return answer;
	}
}
