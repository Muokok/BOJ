package programmers.lv1;

public class L1_동영상_재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        String [] splitVideoLen = video_len.split(":");

        int temp = Integer.parseInt(splitVideoLen[0]);
        int videoSec = temp * 60 + Integer.parseInt(splitVideoLen[1]);

        String [] splitPos = pos.split(":");
        int posSec = Integer.parseInt(splitPos[0])*60 + Integer.parseInt(splitPos[1]);

        String [] splitStart = op_start.split(":");
        int startSec = Integer.parseInt(splitStart[0])*60 + Integer.parseInt(splitStart[1]);

        String [] splitEnd = op_end.split(":");
        int endSec = Integer.parseInt(splitEnd[0])*60 + Integer.parseInt(splitEnd[1]);

        /**
         * 위 중복되는 코드를 아래처럼 하나의 메소드로 빼줄 수 있음
         * public int convertToSeconds(String time) {
         *         String[] split = time.split(":");
         *         return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
         *     }
         *
         * */

        for(int i=0; i< commands.length; i++){
            if(posSec >= startSec && posSec <= endSec){
                posSec = endSec;
            }

            if(commands[i].equals("next")){
                posSec += 10;
            }else{
                posSec -= 10;
            }

            if(posSec < 0){
                posSec = 0;
            }else if(posSec > videoSec){
                posSec = videoSec;
            }
        }

        if(posSec >= startSec && posSec <= endSec){
            posSec = endSec;
        }

        int m = posSec / 60;
        int s = posSec % 60;
        // System.out.print("m ->" + m);
        // System.out.print("s ->" + s);

        String answer = "";
        if(m < 10){
            if(s<10){
                answer = "0"+m +":"+"0"+s;
            }else{
                answer = "0"+m +":"+s;
            }
        }else{
            if(s<10){
                answer = m +":"+"0"+s;
            }else{
                answer = m +":"+s;

            }
        }

        /** 위 answer 만드는 과정 아래처럼 개선 가능
         *         String answer = "";
         *         answer += m < 10 ? "0" + m : m + "";
         *         answer += ":";
         *         answer += s < 10 ? "0" + s : s + "";
         *
         * */

        return answer;
    }
}
