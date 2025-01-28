package programmers.lv1;

public class L1_하샤드_수 {
    public boolean solution(int x) {

        boolean answer = false;
        String str = x +"";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            sum += str.charAt(i) - '0';
        }

        if(x % sum == 0){
            answer = true;
        }


        return answer;
    }
}
