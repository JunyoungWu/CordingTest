
public class Cola {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/132267
	public static void main(String[] args) {
		int a= 2;
		int b=1;
		int c = 20;
		System.out.println(solution(a, b, c));

	}
	public static int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){				//남은 빈병수가 교환을 위한 최소 병수 이상일 경우에 
            answer += (n/a) * b;		//a빈병당 콜라 b병이므로 나눈수에 b를 곱한다  
            n = (n/a) * b + (n%a);		//
        }
        return answer;
    }
}
