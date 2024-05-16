import java.util.HashMap;
import java.util.Map;
public class Discount {
	
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/131127
	final static int DISCOUNT_DAYS= 10;
	public static void main(String[] args) {
		//예시 변수 선언 
		String [] want = {"banana", "apple", "rice", "pork", "pot"};
		int [] number = {3, 2, 2, 2, 1};
		String [] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		
		System.out.println("솔루션 값 : "+solution(want, number, discount));
	
		
	}
	


	 public static int solution(String[] want, int[] number, String[] discount) {
	        int answer = 0;

	        //wMap(원하는 상품과 갯수를 담음) 선언 및 초기화 후  및 필요한 상품 추가
	        Map<String, Integer> wMap = new HashMap<String, Integer>();
	        for (int i = 0; i < want.length; i++) {
	            String s = want[i];
	            int count = number[i];

	            wMap.put(s, count);
	        }

	        //dMap(할인 상품과 그 횟수를 담음 ) 초기화 및 처음 10일치의 상품 추가
	        Map<String, Integer> dMap = new HashMap<String, Integer>();
	        for (int i = 0; i < DISCOUNT_DAYS; i++) {
	            String addItem = discount[i];
	            dMap.put(addItem, dMap.getOrDefault(addItem, 0) + 1);
	        }

	        //첫 10일치의 상품이 추가된 상태에서 equal 함수를 실행하여 answer의 값을 정한다.
	        if (equal(wMap, dMap)) {
	            answer++;
	        }

	        //둘째날부터는 삭제할 상품 과 추가할 상품을 찾아내어 dMap을 업데이트 하고
	        //업데이트한후  equal 메서드를 실행하여 answer의 값을 추가한다.
	        for (int i = 1; i <= discount.length - DISCOUNT_DAYS; i++) {
	            String deleteItem = discount[i - 1];
	            dMap.put(deleteItem, dMap.get(deleteItem) - 1);

	            String addItem = discount[i - 1 + DISCOUNT_DAYS];
	            dMap.put(addItem, dMap.getOrDefault(addItem, 0) + 1);

	            if (equal(wMap, dMap)) {
	                answer++;
	            }
	        }


	        return answer;
	    }

	    public static boolean equal(Map<String, Integer> wMap, Map<String, Integer> dMap) {
	        for (String key : wMap.keySet()) {
	            if (!dMap.containsKey(key) || wMap.get(key) != dMap.get(key)) {
	                return false;
	            }
	        }

	        return true;
	    }
	   

	   
}
