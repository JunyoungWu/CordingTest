
public class Painting {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/161989
	public static void main(String[] args) {

		int n = 8;
		int m = 4;
		int [] section = {2,3,6};
		System.out.println(solution(n, m, section));

	}

	public static int solution(int n, int m, int[] section) {
		
		int start = section[0];
		int end = section[0] + (m - 1);
		int ans = 1;
		//2에서 롤러질을 시작하면 5까지 칠해짐, (start : 2 end : 5)
		// 3은 범위안,6은 범위밖, 따라서 새롭게 start지정후 9:end 
		//이떄 ans++
		for (int i : section) {
			if (i >= start && i <= end)
				continue;
			else {
				start = i;
				end = i + (m - 1);
				ans++;
			}

		}
		return ans;
	}
	
}
