import java.util.HashMap;
import java.util.Iterator;

public class Clothes {
	public static void main(String[] args) {
		String [][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};	//예시 배열
		int answer = solution(clothes);
		System.out.println("옷 조합의 개수 : " + answer);

	}
	
	public static int solution(String[][] clothes) {
		int answer = 1;	//answer의 초기값 선언 
		HashMap<String, Integer> clothesMap =  new HashMap<String, Integer>();	//String을 key값, Integer를 value로 갔는 HashMap 선언
		for(int i = 0 ; i<clothes.length;i++) {			// 주어진 배열의 길이만큼 반복 
			String key = clothes[i][1];					// key의 값으로 옷의 종류를 지정
			clothesMap.put(key, clothesMap.getOrDefault(key, 0)+1);		// 값이없으면 디폴트값으로 0, 아니면 +1이 되게 value값을 설정 
		}
		Iterator<Integer> Combination = clothesMap.values().iterator();		// Iterator를 통하여 hashmap을 순회
		while(Combination.hasNext()) {										// 다음값이 없을때까지 반복 
			answer *= (Combination.next().intValue()+1);					// (특정 옷 종류의 의상 개수+1)*(특정 옷 종류의 의상 개수+1)* ...이런식으로 반복
																			// +1은 해당 종류의 옷을 입지 않았을 경우의 수이다 
		}		
        
        return answer-1;													//아무것도 걸치지 않는 경우의수는 제외하므로 -1
    }
}
