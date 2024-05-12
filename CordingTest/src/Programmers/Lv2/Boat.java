import java.util.Arrays;

public class Boat {

	public static void main(String[] args) {
		//예시 코드
		int[] people = { 70, 50, 80, 50 };
		int limit = 100;
		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		
		int light = 0;	//가장 가벼운사람 
		int heavy = people.length - 1;	//가장 무거운사람 
		Arrays.sort(people);	//정렬
		//가벼운사람 무게가 가장 무거운사람 이하일때까지 반복시킴  
		while (light <= heavy) {
			if (people[light] + people[heavy] <= limit) {
				light++;	//만약 가장무거운사람+가장가벼운사람이 제한 이하면 가벼운사람도 탑승가능하고 가벼운 사람은 다음으로 가벼운 사람이된다
			}

			heavy--;	//무거운 사람은 항상 내린다 
			answer++;	//보트수가 하나씩 늘어난다 

		}

		return answer;
	}
}
