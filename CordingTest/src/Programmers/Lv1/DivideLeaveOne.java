
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/87389
public class DivideLeaveOne {
	
	public static void main(String[] args) {
		int ans = solution(10);
		
		System.out.println("10에 나눠서 나머지가 1인 가장 작은수 : "+ans); 
		
		

	}
	
	 public static int solution(int n) {
	        
			int answer = 0; //초기값 선언 
	        	//최소 2부터 시작하는 반복문 
				// 2부터 등장해서 나머지가 1이되는 경우에 멈춘다
	        for (int i = 2; i < n; i++) {
				
	        	if(n%i == 1) {
	        		answer = i;
	        		break;
	        	}
				
			}
	        
	        return answer;
	    }
}
