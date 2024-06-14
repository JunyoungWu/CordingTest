import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class HallOfFame {

	public static void main(String[] args) {
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		for(int data : solution(k, score)) {
			System.out.println(data);
		}



	}

	  public static int[] solution(int k, int[] score) {
	       int[] answer = new int[score.length];
		ArrayList<Integer> rank = new ArrayList<Integer>();
	
		  for (int i = 0; i < score.length; i++) {
			  
	           
	            rank.add(score[i]);
	            
	          
	            if (rank.size() > k) {
	                rank.remove(Collections.min(rank));
	            }
	            
	          
	            answer[i] = Collections.min(rank);
	        }
                return answer;

	    }
}
