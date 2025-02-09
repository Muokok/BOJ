package programmers.lv1;

public class L1_가장_가까운_같은_글자 {

    public int[] solution(String s) {

        int[] answer = new int [s.length()];
        answer[0] = -1;


        for(int i=1; i< s.length(); i++){
            int minGap = 10001;
            for(int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    minGap = Math.min(minGap, i-j);
                }
            }
            answer[i] = minGap == 10001 ? -1 : minGap;
        }

        return answer;
    }
}
