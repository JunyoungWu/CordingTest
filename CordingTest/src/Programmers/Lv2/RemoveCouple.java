import java.util.ArrayList;
import java.util.Stack;
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class RemoveCouple {

	public static void main(String[] args) {
		int answer = solution("cdccdcdcdsacdddd");
		System.out.println(answer);
	}
	
	//처음 
	/* public static int solution(String s)
	    {    int answer = 0;
	        String [] ansarray = s.split("");
	        ArrayList<String> arrayList = new ArrayList<>();
	        for(String data : ansarray){
	        	
	            arrayList.add(data);
	            String s1 = data;
	        }
	        for(int i = 0 ; i<arrayList.size()-1;i++){
	         if(arrayList.get(i).equals(arrayList.get(i+1))){
	        	 arrayList.remove(i);
	        	 arrayList.remove(i);
	             i -=2;
	             if(i<0) {
	            	 i=0;
	             }
	             if(arrayList.size()==2) {
	            	 if(arrayList.get(0).equals(arrayList.get(1))) {
	            		 answer = 1; 
	            	 }
	            	 
	            	 break;
	             }
	            
	         }
	   
	         if(i>=arrayList.size()-1) {
            	 break;
             }
	        }
	        return answer;
	    }*/
	 //stack학습후 다시짠 코드 
	 public static int solution(String s) {
	        char[] ch = s.toCharArray();	//문자 배열로 변경
	        Stack<Character> ansStack = new Stack<>();
	 
	        for (char c : ch) {
	            if (ansStack.isEmpty()) {	//스택이 비었을시 추가
	            	ansStack.push(c);
	                continue;
	            }
	 
	            if (!ansStack.isEmpty()) {	
	                if (ansStack.peek() == c) {
	                	ansStack.pop();
	                } else {
	                	ansStack.push(c);
	                }
	            }
	        }
	        return ansStack.isEmpty() ? 1 : 0;
	    }
}
