
public class Fibonacci {

	

	 public int solution(int n) {
	        int answer = fibo(n);
	        System.out.println(answer);
	        return answer;
	    }
	    //피보나치를 계산하는 메서드 생성 
	 
	    public int fibo(int n) {
	        int[] cache = new int[n+1]; 
	        
	        cache[0] = 0;
	        cache[1] = 1;
	        //조건에따르는 반복문 생성
	        for (int i=2; i<= n; i++){
	        
	            cache[i] = (cache[i-1] + cache[i-2]) % 1234567;
	        }
	        
	        return cache[n] % 1234567;
	    }
	

}
