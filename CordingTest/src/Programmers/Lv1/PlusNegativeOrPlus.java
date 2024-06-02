
//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class PlusNegativeOrPlus {

	public static void main(String[] args) {
	 int [] absoluts	= {4,7,12};
	 boolean [] signs = {true,false,true};
	 
	 System.out.println("문제의 답 : "+solution(absoluts, signs));

	}
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; //정답 초기값
        
        // absolutes의 길이만큼 반복 해준다 
        
        for(int i = 0 ; i<absolutes.length;i++){
        	
            if(signs[i]==true){		// true일 경우엔 양수이므로 더해준다 
                answer+=absolutes[i];
            }else if(signs[i]==false) {	// false일 경우엔 음수이므로 빼준다 
                answer-=absolutes[i];
            }
        }
       
        return answer;
    }
}
