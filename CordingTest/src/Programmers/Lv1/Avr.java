
public class Avr {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12944
	public static void main(String[] args) {
	 int [] arr = {1,2,3,4,5};
	 System.out.println("배열의 평균 값 : "+solution(arr));

	}
	
	 public static double solution(int[] arr) {
	        int answer = 0; 	//answer 초기값
	        
	        for(int i=0 ; i<arr.length;i++){
	            answer += arr[i];	//각 배열을 모두 더한다 
	        }
	        answer /= arr.length; // 배열의 길이 만큼 나눠주어 평균을 구한다 
	        return answer;
	    }

}
