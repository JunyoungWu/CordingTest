//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Harshad {

	public static void main(String[] args) {
		int a = 11;

		boolean answer = solution(a);
		System.out.println("answer는 " + answer);

	}

	public static boolean solution(int a) {
		int sum = 0; // 자릿수합 초기값
		String as = String.valueOf(a); // 동일값을 가는 문자열로 변경
		String[] aarray = as.split(""); // 한칸씩 나눠 저장
		for (String data : aarray) {
			sum += Integer.parseInt(data);	//나눴던 값들을 Integer로 변환후 더하면 자릿수값을 구할수있다
		}
		if (a % sum == 0) {
			//원본 a에서 자릿수값을 나눠서 나머지가 0일시 하샤드 수이다.
			return true;
		} else {
			return false;
		}

	}

}
