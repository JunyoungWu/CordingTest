import java.util.Arrays;
import java.util.Comparator;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/155651
public class Hotel {
	public static void main(String[] args) {
		String [][] array = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		String t = "15:00";
		String tt = t.replace(":", "");
		int answer = solution(array);
		System.out.println(answer);
	}
	
	 public static int solution(String[][] book_time) {
	        // 시간을 분 단위로 변환하는 함수
	        int[][] times = new int[book_time.length][2];
	        for (int i = 0; i < book_time.length; i++) {
	            times[i][0] = timeToMinutes(book_time[i][0]);
	            times[i][1] = timeToMinutes(book_time[i][1]);
	        }

	        // 종료 시간을 기준으로 정렬
	        Arrays.sort(times, Comparator.comparingInt(a -> a[1]));

	        // 최소 객실 수를 계산
	        int rooms = 0;
	        int[] endTimes = new int[book_time.length];
	        Arrays.fill(endTimes, -1);

	        for (int[] time : times) {
	            boolean allocated = false;
	            for (int i = 0; i < rooms; i++) {
	                if (endTimes[i] <= time[0]) {
	                    endTimes[i] = time[1] + 10; // 청소 시간 포함
	                    allocated = true;
	                    break;
	                }
	            }
	            if (!allocated) {
	                endTimes[rooms] = time[1] + 10; // 새로운 객실 사용
	                rooms++;
	            }
	        }

	        return rooms;
	    }

	    // "HH:MM" 형식을 분 단위로 변환하는 함수
	    private static int timeToMinutes(String time) {
	        String[] parts = time.split(":");
	        int hours = Integer.parseInt(parts[0]);
	        int minutes = Integer.parseInt(parts[1]);
	        return hours * 60 + minutes;
	    }
}
