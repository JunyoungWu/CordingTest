
import java.util.ArrayList;
import java.util.Arrays;
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class FruitSeller {

	public static void main(String[] args) {

	}
	public int solution(int k, int m, int[] score) {
	    ArrayList<Integer> box = new ArrayList<>();
	    Arrays.sort(score);
	    for (int i = score.length - 1; i >= 0; i--) {
	        box.add(score[i]);
	    }
	    
	    int answer = 0;
	    for (int i = 0; i < box.size(); i += m) {  
	        if (i + m <= box.size()) {		//정렬을 해준다 
	            int minValueInGroup = box.get(i + m - 1);	// i를 m만큼 증가시키며 그룹을 형성 
	            answer += minValueInGroup * m;				// 마지막의 과일의 정수를 가져와  가격 을 계산한후 더한다 
	        }
	    }
	    
	    return answer;		
	}
}
