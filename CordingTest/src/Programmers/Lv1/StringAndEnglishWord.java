
public class StringAndEnglishWord {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/81301;
	public static void main(String[] args) {
		String s =  "23four5six7";
		System.out.println(s+"를 치환한 값 : "+solution(s));
	}
    public static  int solution(String s) {
        String [] nArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};	// 각 숫자의 단어를 순서대로 넣은 배열 생성
        for (int i=0; i<nArray.length; i++){		// 0부터9만큼 반복 
            if(s.contains(nArray[i])){				//만약 주어진 문자열이 i번쨰 숫자를 포함하고있다면
                s=s.replace(nArray[i],Integer.toString(i));	//그부분을 해당하는 정수를 String으로 바꾼것으로 바꿔준다
            }
        }
        int answer = Integer.parseInt(s);				//반복문이 끝나면s는 원하는 숫자의 문자열 상태가 되므로 parseInt를 통해 정수로 변환 시켜준다 
        return answer;
    }
}
