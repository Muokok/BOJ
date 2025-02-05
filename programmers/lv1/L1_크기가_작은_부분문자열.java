package programmers.lv1;

public class L1_크기가_작은_부분문자열 {

    public int solution(String t, String p) {
        int answer = 0;

        Long longP = Long.parseLong(p);

        for(int i=0; i<= t.length() - p.length(); i++){
            String sub = t.substring(i, i + p.length());
            Long subT = Long.parseLong(sub);

            // System.out.println(subT);

            if(subT <= longP) answer ++;
        }

        return answer;
    }
}
