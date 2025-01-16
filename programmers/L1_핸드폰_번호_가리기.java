package programmers;

public class L1_핸드폰_번호_가리기 {

    public String solution(String phone_number) {
        int size = phone_number.length();
        String answer = "";


        for(int i= 0; i<size - 4; i++){
            answer += "*";
        }
        for(int j=size - 4; j< size; j++){
            answer += phone_number.charAt(j);
        }

        return answer;
    }

}
