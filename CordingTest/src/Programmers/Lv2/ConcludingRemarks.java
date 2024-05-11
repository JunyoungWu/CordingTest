import java.util.ArrayList;

public class ConcludingRemarks {

	public static void main(String[] args) {
		String [] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int [] ans = solution(3, words);
		System.out.println("["+ans[0]+","+ans[1]+"]"); 
		
		
	}
	public static int[] solution(int n, String[] words) {
		//answer 초기값 생성
	    int[] answer = { 0, 0 };

	    ArrayList<String> a_words = new ArrayList<String>();
	    for (int i = 0; i < words.length; i++) {
	        if (a_words.contains(words[i])) {
	            // 탈락자의 번호
	            answer[0] = (i % n) + 1;
	            // 탈락자 자신의 차례
	            answer[1] = (i / n) + 1;
	            break;
	        }
	        a_words.add(words[i]);
	        if (i > 0) {
	        	//전 단어와 현재 단어 한글자씩 넣은 배열 생성 
	            String[] pa_word = words[i].split(""); 		
	            String[] pr_word = words[i - 1].split("");
	            //전단어의 끝와 현재단어의 시작이 다를떄
	            if (!pa_word[0].equals(pr_word[pr_word.length - 1])) {
	            	//
	                answer[0] = (i % n) + 1;  	//탈락자 번호
	                answer[1] = (i / n) + 1;	//턴이돈횟수 
	                break;
	            }
	        }
	    }

	    return answer;
	}


}
