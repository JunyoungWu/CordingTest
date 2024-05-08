package assignment;

public class IronSuit {
	public static int solution(int n) {
	    int ans = 0; // 최소 건전지 사용량
	    while (n > 0) {
	        if (n % 2 == 0) { // 현재 위치가 짝수일 때는 순간이동
	            n /= 2;
	        } else { // 현재 위치가 홀수일 때는 한 칸 앞으로 점프
	            n--;
	            ans++;
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {
	    int distance = 20;
	    int minimumBatteryUsage = solution(distance);
	    System.out.println("거리 " + distance + "만큼 떨어진 장소로 이동하기 위한 최소 건전지 사용량: " + minimumBatteryUsage);
	}
	
}