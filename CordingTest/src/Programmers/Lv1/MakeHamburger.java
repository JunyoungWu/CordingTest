import java.util.*;

public class MakeHamburger {

	public static void main(String[] args) {
		int[] ingredient1 = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		int[] ingredient2 = { 1, 3, 2, 1, 2, 1, 3, 1, 2 };
		System.out.println(solution(ingredient1)); // Expected output: 2
		System.out.println(solution(ingredient2)); // Expected output: 0

	}

	public static int solution(int[] ingredient) {
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		for (int item : ingredient) {
			stack.push(item); // 재료를 스택에 추가
			// 스택의 크기가 4 이상인지 확인
			if (stack.size() >= 4) {
				// 마지막 4개의 원소를 확인하여 햄버거 순서인지 확인
				if (stack.get(stack.size() - 4) == 1 && stack.get(stack.size() - 3) == 2
						&& stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 1) == 1) {
					count++;
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
					// 햄버거 순서가 맞으면, 햄버거 개수를 증가시키고 마지막 4개의 원소를 제거
				}
			}
		}
		return count;
	}

}
