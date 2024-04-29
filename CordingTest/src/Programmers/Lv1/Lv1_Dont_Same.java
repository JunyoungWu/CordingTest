import java.util.ArrayList;

public class Lv1_Dont_Same {

	public static void main(String[] args) {
		  int [] arr = {1,1,3,3,0,1,1};  // arr 예시
		  ArrayList<Integer> ans = new ArrayList<Integer>(); //answer ArrayList 생성
		  int value = -1;	//조건에 들어가지않는 숫자 선언
		  //연속되는 숫자 제거
		  for(int i =0; i<arr.length;i++) { 
			  if(arr[i] !=value) {
				  ans.add(arr[i]);
				  value=arr[i];
			  }
		  }
		  //ArrayList를 배열로 
		  int [] answer =  ans.stream().mapToInt(i->i).toArray();
		  	for (int data : answer) {
		  		System.out.println(data);
		  	}
	}
}