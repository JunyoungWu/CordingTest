public class LowerString {
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t, p)); // 결과: 2
        
    
    }

    public static int solution(String t, String p) {
        int pLength = p.length();
        int tLength = t.length();
        long pValue = Long.parseLong(p); // long 타입으로 변경
        int count = 0;

        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + pLength);		//원하는 부분만 분리한다 
            if (Long.parseLong(sub) <= pValue) { // long 타입으로 변경
                count++;
            }
        }

        return count;
    }
}
