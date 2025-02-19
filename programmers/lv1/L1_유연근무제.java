package programmers.lv1;

public class L1_유연근무제 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {

        // 출근 희망 시각을 담은 배열: schedules
        // 일주일 동안 출근한 시각을 담은 배열: timelogs
        // 시작 요일: startday


        // 인정 시각: 10:50 -> 11:00 (1060)
        // 들어온 시간: 11:00 -> 11:00 (1100)
        // 출근 희망 시각과 실제로 출근한 시각을 100으로 나눈 나머지는 59 이하입니다.

        int answer = timelogs.length;
        for(int i=0; i<timelogs.length; i++){
            int maxTime = changeTime(schedules[i]+10);
            int today = startday;

            for(int j=0; j<timelogs[i].length; j++){
                if(today == 6 || today == 7 || today == 0){
                    today = (today +1) % 7;
                    continue;
                }

                if(timelogs[i][j] > maxTime){
                    answer --;
                    break;
                }
                today = (today +1) % 7;
            }

        }

        return answer;
    }

    private int changeTime(int time){
        // if(time %100 >= 60) +100 + (time%100)%60; ex: 1069
        if(time % 100 >= 60){
            time = (time/100)*100 + 100 + (time%100)%60;
        }

        return time;
    }
}
