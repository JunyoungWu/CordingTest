import java.util.Arrays;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12982?language=java
public class Budget {

	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		int budget = 9;
		int answer = solution(d, budget);
		System.out.println(answer); 
		
		
	}
	public static int solution (int[] d, int budget) {
		int answer = 0;		//정답 초기값 선언
		int money  = 0;		//소모될 돈 
		Arrays.sort(d);		//신청 예산이 적은 부서순서로 정렬
		for(int i = 0; i<d.length;i++) {	//최대 부서 개수만큼 진행되는 반복문 생성
			
			if(money+d[i]<=budget) {	//현재소모된돈에 다음 부서 신청예산을 더해도 최대예산 이하일시 진행,answer(지원받은 부서수 )1증가
			
				money += d[i];
			
				answer++;	
			}else {break;}
			
		}
        return answer;
        
		
	}
}
