//문제: https://school.programmers.co.kr/learn/courses/30/lessons/82612

public class CalInsufficient {
	public static void main(String[] args) {
	
		
	
	}
	public long solution(int price, int money, int count) {
        long answer = 0;
        long total=0;
		
        //탄 횟수만큼 반복하는 금액계산
        for(int i=1; i<count+1; i++){
            total += price*i;
        }
        //비용>가진돈
        if(money<total)
            answer = total-money;
        //비용<가진돈
        else
            answer = 0;
        
        return answer;
    }

}
