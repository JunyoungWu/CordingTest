import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class PriInfo {

	public static void main(String[] args) {
			String  today = "2022.05.19";
			String []  terms = {"A 6", "B 12", "C 3"};
			String []  privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
			
			int [] answer = solution(today, terms, privacies);
			
			for(int data : answer) {
				System.out.println(data);
			}
	}
	 public static int[] solution(String today, String[] terms, String[] privacies) {
	        List<Integer> answer = new ArrayList<>();
	        Map<String, Integer> map = new HashMap<>();

	        // 오늘 날짜를 계산하여 변수에 저장
	        int cDate = gDate(today);

	        // 날짜를 계산하기 위해 정보를 맵에 저장
	        for (String s : terms) {
	            String[] term = s.split(" ");
	            map.put(term[0], Integer.parseInt(term[1]));
	        }
	        // 개인정보 배열을 순회하여 처리 완료된 개인정보를  찾아서 리스트에 추가
	        for (int i = 0; i < privacies.length; i++) {
	            String[] priList = privacies[i].split(" ");
	            // 처리가 완료된 날을 계산해준다(처리 시작일 + 처리기간*28일)
	            if (gDate(priList[0]) + (map.get(priList[1]) * 28) <= cDate) {
	                answer.add(i + 1);
	            }
	        }
	        // 리스트를 배열로 변환
	        return answer.stream().mapToInt(i -> i).toArray();
	    }
	    // 날짜를 입력받아 정수값으로 반환
	    public static int gDate(String date) {
	        String[] arr = date.split("\\.");
	        int year = Integer.parseInt(arr[0]);
	        int month = Integer.parseInt(arr[1]);
	        int day = Integer.parseInt(arr[2]);
	        // 날짜를 연도 * 12 * 28 + 월 * 28 + 일 로 계산하여 반환
	        return (year * 12 * 28) + (month * 28) + day;
	    }
	
}
