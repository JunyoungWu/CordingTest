import java.util.ArrayList;
import java.util.List;

public class VowelDictionary {
	static List<String> dic;
	static String[] words = { "A", "E", "I", "O", "U" };

	public static void main(String[] args) {
	

	}

	public int solution(String word) {

		int answer = 0;
		dic = new ArrayList<>();	//사전에 들어갈수있는 모든 단어를 넣는 과정 
		dfs("", 0);
		int size = dic.size();
		for (int i = 0; i < size; i++) {	//원하는 단어를 찾으면 그게 몇번째 배열인지 반환한다 
			if (dic.get(i).equals(word)) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	static void dfs(String str, int len) { //처음에 빈문장""과,0이 들어간다 >  dfs("",0)
		dic.add(str);						 //""을 사전에 넣는다 
		if (len == 5)					 	 //단어 제한이 5글자 이므로 5개이면 종료한다 
			return;
		for (int i = 0; i < 5; i++) {		 //반복문을 통하여 words의 모든요소를 순회하므로 첫번째 사이클  dfs("A", 1), dfs("E", 1), dfs("I", 1), dfs("O", 1), dfs("U", 1)이 돌아간다 
											 //같은 방식으로 여러개의 두번쨰 싸이클의 돌아가는데 그중  dfs("A", 1)만 예시로 보면  dfs("AA", 2), dfs("AE", 2), dfs("AI", 2), dfs("AO", 2), dfs("AU", 2)가 돌아간다 
			dfs(str + words[i], len + 1);    //이런식으로 각 단어가 가질수 있는 모든 경우의수를 dic에 추가하여 사전 단어 배열을 만들어낸다. 
		}
	}
}
