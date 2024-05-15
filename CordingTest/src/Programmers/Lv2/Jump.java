
public class Jump {

	//문졔 : https://school.programmers.co.kr/learn/courses/30/lessons/12914
	//숫자가 늘어날수록 경우가 기하급수적으로 늘어나는데 이를 계산하기 위해선 규칙성을 찾아야한다
	//2칸 가야할 경우, 1+1, 2의 경우의수가존재한다
	//3칸 가야할 경우 1+1+1, 1+2, 2+1의 경우의수가 존재한다
	//4칸 가야할 경우 1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2
	//4칸경우의수들을 나눠서볼수있는데, 
	//(1+1+1)+1, (1+2)+1, (2+1)+1, (1+1)+2, (2)+2   
	//괄호는 각각 2칸 경우의수,3칸 경우의 수이다  4칸은 4-2, 2칸가야할경우에서 +2만 더한것과, 4-1, 3칸가야할
	//+1만 더한것이 합쳐진것이다 따라서 경우의 수는 4칸경우의수 = (4-2)칸 경우의수 + (4-1)칸 경우의수인것을 알수있다.
	
	
	
	public static void main(String[] args) {
	System.out.println(solution(3));	
		
		
	 
	        
	}

	private static long solution(int n) {
		 long[] answer = new long[2001];	//2001은 0번부터 인식하므로 2001로 하였다 
	        answer[1] = 1; 		// 수를 구하기위해선 -2까지의 경우의수를 알아야하므로 1,2를 지정해준다 
	        answer[2] = 2;
	 
	        for (int i = 3; i < 2001; i++) {
	            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
	        }
	       
	        return answer[n];
		
	}

}
