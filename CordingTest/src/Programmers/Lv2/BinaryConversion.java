//문제 : https:school.programmers.co.kr/learn/courses/30/lessons/70129
public class BinaryConversion {

	public static void main(String[] args) {
		String s = "110010101001";
		int [] answer = solution(s);
		System.out.println("배열 s에 대한 값 ");
		System.out.println("이진 변환 횟수 : "+ answer[0]);
		System.out.println("제거한 0의 갯수 : "+answer[1]);
	}

	public static int[] solution(String s) {

		int[] answer = new int[2]; // 길이가 2인 배열로 answer 선언

		while (s.length() > 1) {

			int oneNum = 0;		//1의 갯수를 측정할 변수 선언
			for (int i = 0; i < s.length(); i++) {	//입력된 문자열의 길이만큼 반복

				if (s.charAt(i) == '0') {
					answer[1]++;	//0의 갯수만큼 answer 배열의 2번째값 상승 
				} else {
					oneNum++;		//1의 갯수를 카운트 
				}
			}

			s = Integer.toBinaryString(oneNum);	//1의갯수를  이진수로 변경한다 
			answer[0]++;						//한바퀴 돌때마다 answer 배열의 1번째 값상승
												
		}

		return answer;							// 최종값 리턴 
	}

}
