import java.util.Arrays;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class KNumber {

    public static void main(String[] args) {
       
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] cutArray = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < cutArray.length; j++) {
                cutArray[j] = array[commands[i][0] - 1 + j];
            }
            Arrays.sort(cutArray);
            answer[i] = cutArray[commands[i][2] - 1]; // k번째 숫자를 정답 배열에 저장
        }
        return answer;
    }
}
