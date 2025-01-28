package programmers.lv1;

public class L1_가운데_글자_가져오기 {

    public String solution(String s) {

        if(s.length() % 2 !=0){
            return s.charAt((int) s.length() / 2) + "";
        }else{
            return s.charAt((int) ((s.length() / 2)  -1)) + "" + s.charAt((int) s.length() / 2);
        }
    }
}
