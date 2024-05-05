
import java.util.Arrays;

public class MakeMin {

	public static void main(String[] args) {

		int[] A = { 1, 4, 2 }; // 배열 예시
		int[] B = { 5, 4, 4 };
		int answer = 0; // 초기화
		Arrays.sort(A); // 오름차순 정렬
		Arrays.sort(B);

		// A는 앞에서부터,B는 뒤에서부터 곱해서 최솟값 도출
		int size = A.length;
		for (int i = 0; i < size; i++) {
			answer += A[i] * B[size - 1 - i];
		}

		System.out.println(answer);

	}

}
