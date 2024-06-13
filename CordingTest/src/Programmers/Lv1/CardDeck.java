
public class CardDeck {

	public static void main(String[] args) {
		String [] cards1  = {"i", "drink", "water"};
	
	String [] cards2 = {"want", "to"};
	String [] goal  = {"i", "want", "to", "drink", "water"};
	String answer =  solution(cards1, cards2, goal);
	System.out.println("답 : "+ answer);

	}
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1num = 0; // cards1 배열의 n번쨰숫자
        int card2num = 0; // cards2 배열의 n번쨰숫자
        
        // goal 배열 순회
        for (String data : goal) {
        	
            // data가 cards1[card1num] 또는 cards2[card2num]에 포함하는지 확인
            if (card1num < cards1.length && data.equals(cards1[card1num])) {
            	card1num++; // cards1[card1num]에 포함하는 경우 card1num 증가
            } else if (card2num < cards2.length && data.equals(cards2[card2num])) {
            	card2num++; // cards2[card2num]에 포함하는 경우 card2num 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }
        
        return "Yes";
    }

}
