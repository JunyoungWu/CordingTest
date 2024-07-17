import java.util.Arrays;
import java.util.Comparator;

public class SortLike {

	public static void main(String[] args) {
		
		String [] strings = {"abce", "abcd", "cdx"};
		int  n = 2;
		String [] answer  = solution(strings, n);
 		for(String data: answer ) {
 			System.out.println(data);
 		}
		
		
	}

	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// n번째 문자로 비교
				if (s1.charAt(n) != s2.charAt(n)) {
					return s1.charAt(n) - s2.charAt(n);
				}
				// n번째 문자가 같으면 사전순으로 비교
				return s1.compareTo(s2);
			}
		});
		return strings;
	}
}
