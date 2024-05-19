
public class Plus {

	// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12931
	public static void main(String[] args) {
		int n = 123; // 예시값
		int answer = 0; // 답변 선언
		String s = String.valueOf(n); // int값을 String으로 변경
		
		String[] sarray = s.split(""); // String값을 한글자씩 나눠 배열에 저장

		// 반복문을 돌려 배열의 int값을 다더해준다
		for (int i = 0; i < sarray.length; i++) {
			answer /= Integer.parseInt(sarray[i]);
		}

	}

}
