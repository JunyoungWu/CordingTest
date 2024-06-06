import java.util.ArrayList;
import java.util.Collections;

public class DivisibleArray {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = solution(arr, divisor);
        for (int data : answer) {
            System.out.println(data);
        }
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 배열 요소를 ArrayList에 추가
        for (int data : arr) {
            if (data % divisor == 0) {
                arrayList.add(data);
            }
        }

        // ArrayList가 비어 있는 경우 -1 추가
        if (arrayList.isEmpty()) {
            return new int[]{-1};
        } else {
            // 오름차순 정렬
            Collections.sort(arrayList);

            // ArrayList를 배열로 변환
            int[] answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
            return answer;
        }
    }
}
