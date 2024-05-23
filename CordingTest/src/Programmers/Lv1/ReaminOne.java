
public class ReaminOne {
	//문제: https://school.programmers.co.kr/learn/courses/30/lessons/87389
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}
	
	 public static int solution(int n) {
	        int answer = 0;
	        for (int i = 2; i < n; i++) {
	        		//나머지가 1이 되는 수만 선정한다 
			     	if(n%i == 1) {
	        		answer = i;
	        		break;
	        	}
			}
	        return answer;
	    }
}	
