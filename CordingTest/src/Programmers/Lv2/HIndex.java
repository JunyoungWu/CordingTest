import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int [] array = {3, 0, 6, 1, 5};
		Arrays.sort(array);
		/*for(int data : array) {
			System.out.println(data+",");
		}*/
		System.out.println(solution(array));
		
	}

	

	public static int solution(int[] citations) {
	    Arrays.sort(citations); // 인용 횟수를 오름차순으로 정렬
	    int n = citations.length;
	    int answer = 0;

	    for (int i = 0; i < n; i++) {
	        
	        int count = n - i; // h번 이상 인용된 논문의 수
	        
	        if (citations[i] >= count) {
	            answer = count; // h-index를 count로 설정
	            break;
	        }
	    }
	    return answer;
	}


}
