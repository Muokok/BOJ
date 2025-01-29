package programmers.lv1;

public class L1_문자열_다루기_기본 {

    public boolean solution(String s) {
        int length = s.length();

        if(length != 4 && length != 6){
            return false;
        }else{
            for(int i=0; i< length; i++){
                if(s.charAt(i) - '0' > 9){
                    return false;
                }
            }
        }

        return true;
    }
}
