
public class MatchExpect {

	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12985
	
	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		int answer = solution(n, a, b);
		System.out.println("a가b가 만나게될 라운드는 " + answer+"라운드 입니다");
	}
	public static int solution(int n, int a, int b) {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;		//결과값이  n.5던 n.0 n만 출력되므로 하게될 경기 번호가 2명씩 같다 .
            b = (b + 1) / 2;		//이걸 반복하면 둘이 하게될 경기 순서가 같아지게된다. 
            round++;				//한바퀴돌때마다 라운드수가 바뀐다 
        }
        return round;
    }
}
