package programmers.lv1;

public class L1_서울에서_김서방찾기 {
    public String solution(String[] seoul) {
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 "+i+"에 있다";
            }
        }
        return "";
    }
}
