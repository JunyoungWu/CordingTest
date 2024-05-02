
public class MaxMin {

	public static void main(String[] args) {
		String s = "2 3 5 4";
		
		String [] a = s.split(" ");  // 주어진 문자열을 공백한칸을 기준으로 나눈 문자 배열을 만든다
		int max_Num= 0;				// 최댓값 변수 선언
		int min_Num=0;				// 최솟값 변수 선언
		
		// 최댓,최솟값 변수를 배열첫번쨰값을  integer로 치환한 값으로 바꿔준후, 문자 배열을 도는 반복문을 통해 계속 비교하며 최댓값,최솟값을 찾아준다 
		for(int i = 0; i<a.length; i++) {
			max_Num=Integer.parseInt(a[0]);
			min_Num=Integer.parseInt(a[0]);
			if(max_Num<Integer.parseInt(a[i])) {
				max_Num=Integer.parseInt(a[i]);
			}
			if(min_Num>Integer.parseInt(a[i])) {
				min_Num=Integer.parseInt(a[i]);
			}
			
		}
		//최솟값"공백"최댓값으로 이루어진 문자열로 다시 바꿔준다 
		String answer = min_Num+" "+max_Num;
		System.out.println(answer);

	}

}
