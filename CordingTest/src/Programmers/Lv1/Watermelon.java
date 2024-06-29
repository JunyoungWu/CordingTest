
public class Watermelon {
//문제: https://school.programmers.co.kr/learn/courses/30/lessons/12922
	public static void main(String[] args) {
		int num = 3;
		String answer = solution(num);
		System.out.println(answer);
	}
	 public static String solution(int n) {
	        
	        String answer = "";
	        for (int i = 1 ; i<=n; i++){
	            if(i%2==0){
	                 answer += "박";	//짝수일땐 박을,홀수일땐 수를 더해준다
	            }else{
	                answer +="수";
	            }
	            
	           
	        }
	        return answer;
	    }
}	
