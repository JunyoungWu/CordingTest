/*괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
es)
 s	  answer
"()()" > true
"(())()" > true
")()("	> false
"(()("	> false

*/


public class Bracket {

    boolean solution(String s) {
        
        int Count = 0;  //괄화에 수에따라 변화할 변수

        for (int i = 0; i < s.length(); i++) {
            //(를 만나면 1을 더하고 )를 만나면 1을 빼준다 -> 갯수가 같다면 반복문 끝에 count는 0이된다.
        	if (s.charAt(i) == '(') {
                Count++;
            } else if (s.charAt(i) == ')') {
                Count--;
            }
            //만약 count가 음수가 되는 순간이 있다면 올바른 괄호 형태가 아니다 
             if (Count < 0) {
                return false;
            }
           
        }

         if (Count == 0) {
            return true;
        }
        else{return false;}
    }
}
