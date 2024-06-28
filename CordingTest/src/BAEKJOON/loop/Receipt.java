import java.util.Scanner;
//문제 :  https://www.acmicpc.net/problem/25304
public class Receipt {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();			//총액
        int N = scan.nextInt();			//산 물건 종류의 개수
        int a = 0;						// 물건종류, 가격 선언
        int b = 0;
        int sum = 0;					//실제 내야할 돈 선언
        
        for (int i = 0; i < N; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            sum += a * b;		//물건종류에 개수만큼 곱하고 sum에 더한다 
        }
        
        boolean flag = (sum == X);	//sum이 영수증 총액과 같으면 Yes를,아니면 No를 출력
        if(flag==true) {
        	  System.out.println("Yes");
        }else {
        	  System.out.println("No");
        }
      
    }
}
