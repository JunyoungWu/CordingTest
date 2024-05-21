//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class SumOfBtwn {

	public static void main(String[] args) {
		long answer = solution(100, 105);
		System.out.println("answer의 값 : " + answer);
	}
	 public static long solution(int a, int b) {
		 	
	        long answer = 0; //초기값
	        
	        
	        //a가 b보다 작을경우 
	       if (a < b) {
	    	   //작은수부터 시작하여 반복문을 통해 하나씩 다 더해준다 
				for (int i = a; i <= b; i++) {
					answer += i;
				
				}
			}else {			//a가 b보다 크거나 같을경우 
				for (int i = b; i <= a; i++) {
					answer += i;
					
				}
			}
	        
	        return answer;
	    }

}
