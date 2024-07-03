import java.util.ArrayList;
import java.util.List;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockExam {
    public static void main(String[] args) {
        int[] answer = { 1, 3, 2, 4, 2 };
        int[] result = new MockExam().solution(answer);
        
        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] solution(int[] answers) {
        int[] first = { 1, 2, 3, 4, 5 };
        int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] scores = { 0, 0, 0 };

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                scores[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                scores[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                scores[2]++;
            }
        }

        // 최대 점수 찾기
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        // 가장 많이 맞힌 사람 찾기
        List<Integer> topScorers = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                topScorers.add(i + 1);
            }
        }

        // 리스트를 배열로 변환
        int[] result = new int[topScorers.size()];
        for (int i = 0; i < topScorers.size(); i++) {
            result[i] = topScorers.get(i);
        }

        return result;
    }
}
