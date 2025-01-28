package programmers.lv1;

public class L1_자연수_뒤집어_배열로_만들기 {

    public int[] solution(long n) {
        String stringN = n + "";

        int[] answer = new int [stringN.length()];
        int j = 0;

        for(int i=stringN.length()-1; i>=0; i--){
            answer[i] = Character.getNumericValue(stringN.charAt(j));
            //answer[i] = Integer.parseInt(stringN.charAt(j)); 이건 오류가 남
            j++;
        }

        return answer;
    }
}
