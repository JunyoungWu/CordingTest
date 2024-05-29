
//문제:https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class BlockPnum {

	public static void main(String[] args) {
		System.out.println(solution("01041047864"));
	}
	public  static String solution(String phone_number) {
        String answer = "";
        String [] ansarray = phone_number.split("");
        //뒤에서 4자리일 경우에만 *로 대체한다
        for(int i = 0; i<ansarray.length;i++){
            if(i<ansarray.length-4) {
            	ansarray[i]="*";
            }
            
            answer+= ansarray[i];
        }
        return answer;
    }

}
