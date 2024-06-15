public class YearningScore {
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/176963
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };
        int[] answer = solution(name, yearning, photo);
        for (int data : answer) {
            System.out.println(data);
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int k = 0; k < photo.length; k++) { // photo 배열의 행을 순회
            int ans = 0;
            for (int i = 0; i < photo[k].length; i++) { // photo 배열의 열을 순회
                for (int j = 0; j < name.length; j++) { // name 배열을 순회
                    if (photo[k][i].equals(name[j])) { // 문자열 값을 비교
                        ans += yearning[j];
                    }
                }
            }
            answer[k] = ans; // 각 행의 결과를 answer 배열에 저장
        }

        return answer;
    }
}
