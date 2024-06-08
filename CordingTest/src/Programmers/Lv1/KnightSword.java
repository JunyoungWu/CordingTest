
public class KnightSword {
	// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/136798
	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
		System.out.println("필요한 철의 무게 : " +solution(number, limit, power));

	}
	
	 public static int solution(int number, int limit, int power) {
	        int answer = 0;
	        
	        for(int i=1;i<=number;i++){		//기사의 수만큼 반복되는 반복문 생성
	            int cnt = 0;		//count 변수를 통해 약수의 각 기사별 약수의 개수(공격력)를 파악한다 
	            for(int j=1;j<=i;j++){
	                if(i%j==0) cnt++;
	            }
	            
	            if(cnt>limit) {	//만약 공격력이 제한보다 높다면 공격력을  지정된 공격력으로 변경 
	            	cnt = power;
	            }	
	            answer += cnt;		//공격력당 철이 발생하므로 더해준다 
	        }
	        
	        return answer;
	    }
}
