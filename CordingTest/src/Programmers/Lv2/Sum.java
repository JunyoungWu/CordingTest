public class Sum {

    public static void main(String[] args) {
        int[] sequence = { 1, 1, 1, 2, 3, 4, 5 };
        int[] answer = new int[2];
        int k = 5;
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            for (int j = i; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum == k && minLength > j - i) {
                    answer[0] = i;
                    answer[1] = j;
                    minLength = j - i;
                    break;
                } else if (sum > k) {
                    break;
                }
            }
        }
        
        System.out.println("[" + answer[0] + ", " + answer[1] + "]");
    }

}