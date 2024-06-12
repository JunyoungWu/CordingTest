
public class Collatz {
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12943
	public static void main(String[] args) {
		int answer = solution(1);
		System.out.println("answer : " + answer);
	
	}
	 public static int solution(int num) {
	        long lnum = (long) num;	//3을 곱할때 오버플로우가 발생할 가능성이 존재하므로 long로 변경해준다 
	        int answer = 0;
	        if(num==1) {				//1일때는 반복할 필요가 없으므로 바로 answer 0 대입후 메서드 종료
	        	answer = 0;
	        }else {
	        	 for(;;){
	 	        	
	 	            if(lnum%2==0){
	 	                lnum = lnum/2;		//짝수일시 2로 나눔 
	 	                answer++;
	 	                }else {
	 	                lnum=(lnum*3)+1;	//홀수일시 3을곱하고 1을더한다 
	 	                    answer++;
	 	            }
	 	            if (lnum==1){
	 	                break;				//1일때멈춘다 
	 	            }
	 	            if(answer>500){			//횟수가 500번을 넘으면 -1을 반환한다 
	 	                answer=-1;
	 	                break;
	 	            }
	 	        }
	        }
	       
	        
	        return answer;
	    }
}
