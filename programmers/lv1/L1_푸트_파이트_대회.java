package programmers.lv1;

public class L1_푸트_파이트_대회 {

    public String solution(int[] food) {
        String answer = "";

        for(int i=1; i < food.length; i++){
            int count = food[i]/2;
            for(int j=0; j<count; j++){
                answer += (i + "");
            }
        }
        String temp = answer;
        answer += "0";

        for(int i=temp.length() -1; i>=0; i--){
            answer += temp.charAt(i) + "";
        }

        System.out.println(answer);


        return answer;
    }
}
