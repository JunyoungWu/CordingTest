import java.util.Scanner;
//문제 https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class SqaureStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        
        //세로로 하고싶은값에 b 가로값에 a를 넣는다
		for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }

		}

}
		}