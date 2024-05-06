
public class JadenCase {

	public static void main(String[] args) {
        String s = "3people unFollowed me"; // 예시 문장
		String a [] =s.split("");	//문장과 내용이같은 배열 추가
		StringBuilder anyBuilder = new StringBuilder(); 
        
		//1번조건. 첫번쨰글짜면 대문자로 변경
		//2번조건. 공백이 있을시 그 다음문자는 대문자로 변경+ 범위조건을 지키기위해 a.length-1을 추가
		//3번조건. 대문자가 아니여야할자리에 대문자가 있으면 소문자로변경(그전문자가 공백인지 아닌지 확인 + i가0일때는 제외) 
		for(int i  = 0 ;i<a.length ; i++){
            if (i==0){
                a[i]= a[i].toUpperCase();
            }
            if(a[i].equals(" ")&&i!=a.length-1){
                a[i+1]=a[i+1].toUpperCase();
            }
            if(i>0&&!a[i-1].equals(" ")) {
            	a[i]=a[i].toLowerCase();
            }
            anyBuilder.append(a[i]); 
        }
         
        String answer = anyBuilder.toString(); 
        System.out.println(answer);

	}

}
