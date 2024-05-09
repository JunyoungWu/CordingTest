package cordingTest;

import java.util.ArrayList;


public class sumOfDivisor {
	
	public static void main(String[] args) {
		int n = 4;
		solution(n);
	    System.out.println("입력된 수 : " + n + "\t"+n+"의 약수의 합 : " + solution(n));
	}
	

    public static int solution(int n) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
	//1부터N까지 반복을 돌려 나머지가 0인수만 추가
        for(int i=1; i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        for(int data : list){
            
            sum+=data;
        }
        int answer = sum;
        return answer;
    }
}
