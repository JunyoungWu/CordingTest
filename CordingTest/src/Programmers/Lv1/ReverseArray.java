
public class ReverseArray {
	// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12932
	public static void main(String[] args) {
		Long b = 12345L; //예시값

		String ex = String.valueOf(b); //String 값으로 변경후 한칸씩나눠 배열에 저장 
		String[] exarray = ex.split("");
		
		int[] iarray = new int[exarray.length];	//저장한 배열과 길이가 같은 int 배열 선언 
		//문자열 배열의 끝에서부터 값을 지정해준다 
		for (int i = 0; i < exarray.length; i++) {
			iarray[i] = Integer.parseInt(exarray[exarray.length - 1 - i]);
		}
		
		

	}

}
