
public class TwoThousandSixteen {
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
	
	public static void main(String[] args) {
		int a=5;
		int b=24;
		System.out.println(solution(a, b));

	}
	public static String solution(int a, int b) {
	       String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};	//달별로 일수를담은 배열 선언 
		        int sum = 0;
		        for (int i = 0 ; i<a;i++){
		            sum+=months[i];		// 달의 숫자만큼 총합을 더해준후에 
		        }              		
		        sum+=b;					// 일의 숫자만큼 추가로 더해준다 
		        String answer = day[(sum+4)%7];		//금요일 시작임으로 +4
	        return answer;
	    }
}
