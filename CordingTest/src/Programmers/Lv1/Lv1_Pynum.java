


public class Lv_1Pynum {

	public static void main(String[] args) {
		 boolean answer = false;
	        int pcount = 0;
	        int ycount = 0;
	        String p= "Pyy";
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        String[] s =p.split("");
	        for(String data: s){
	        	System.out.println("data값:"+data);
	        	System.out.println("data대문자값:"+data.toUpperCase());
	            if(data.toUpperCase().equals("P")){
	                pcount = pcount+1;
	            }else if (data.toUpperCase().equals("Y")){
	                ycount = ycount+1;
	            }
	            System.out.println("PCOUNT : "+pcount);
		        System.out.println("YCOUNT : "+ycount);
	        }
	       
	        if (pcount == ycount){
	            answer = true;
	        }
	       
	        System.out.println(answer);

	}

}

