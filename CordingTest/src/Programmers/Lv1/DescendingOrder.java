
public class DescendingOrder {
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12932
	public static void main(String[] args) {
		long  n = 12345;
		System.out.print("n에 대한 값 : ");
		for ( int data : solution(n) ) {
			System.out.print(data);
		}
	}
	
	public  static int[] solution(long n) {
        String ex = String.valueOf(n);		//n과 같은 값을 가지는 문자열 생성 
		String [] exarray = ex.split("");	//한글자씩 나눈 배열 생성
		int [] answer = new int[exarray.length];	//그 배열과 길이가 같은 배열 생성
		//배열의 역순으로 선언해준다 
        for(int i = 0; i<exarray.length;i++) {
			answer[i]=Integer.parseInt(exarray[exarray.length-1-i]);
			
		}
        
        return answer;
    }
}
