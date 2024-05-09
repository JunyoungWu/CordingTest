package cordingTest;

public class OddEven {

	public static void main(String[] args) {
		int n = 5;
		int n1 = 4;
		int n2 = 0;
		System.out.println(n+"은 "+solution(n)+"입니다.");
		System.out.println(n1+"은 "+solution(n1)+"입니다.");
		System.out.println(n2+"은 "+solution(n2)+"입니다.");

	}
	public static String solution(int num) {
        
        String answer = "";				
        //짝수는 2로 나누면 나머지가 0, 홀수는 1인것을 이용하여 Even이 될수 Odd가될수 구분 
        if(num % 2 ==0 || num==0){
            answer = "Even";
        }else{
            answer="Odd";
        }
        return answer;
    }
}
