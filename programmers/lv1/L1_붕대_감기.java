package programmers.lv1;

public class L1_붕대_감기 {
      /** 나의 코드*/
//    public int solution(int[] bandage, int health, int[][] attacks) {
//
//        // t초 연속으로 붕대 감기를 성공한다면? 추가 회복량만큼 추가 회복
//        // bandage -> 기술의 시전 시간, 1초당 회복량, 추가 회복량
//        // health -> 최대 체력
//        // attacks -> [몬스터의 공격 시간, 피해량]을 담은 배열
//
//        // 현재 체력 변수 -> curHealth
//        int curHealth = health;
//
//        curHealth -= attacks[0][1]; // 맨 처음 공격 진행
//
//        // 1,1,1    5     [1,2  3,2]    3
//
//        for(int i=1; i< attacks.length; i++){
//            int time = attacks[i][0] - attacks[i-1][0] - 1;
//
//            if(time >= bandage[0]){ // 추가 회복
//                if(time-bandage[0] == 0){
//                    curHealth += bandage[2];
//                }else{
//                    curHealth += bandage[2]*(time/bandage[0]);
//                }
//
//            }
//
//            curHealth += time*bandage[1]; // 일반 회복
//
//            if(curHealth >= health){
//                curHealth = health;
//            }
//
//            curHealth -= attacks[i][1];
//            if(curHealth <= 0){
//                return -1;
//            }
//        }
//
//        return curHealth;
//    }

    /** 개선한 코드*/
    public int solution(int[] bandage, int health, int[][] attacks) {

        int curHealth = health; // 현재 체력 변수

        curHealth -= attacks[0][1]; // 맨 처음 공격 진행

        for(int i=1; i< attacks.length; i++){
            int time = attacks[i][0] - attacks[i-1][0] - 1; // 이전 공격과 현재 공격 사이의 시간 차이

            if(time >= bandage[0]){ // 추가 회복
                curHealth += bandage[2]*(time/bandage[0]);
            }

            curHealth += time*bandage[1]; // 일반 회복

            if(curHealth >= health){ // 최대 체력 이상이라면
                curHealth = health;
            }

            curHealth -= attacks[i][1]; // 공격 진행
            if(curHealth <= 0){
                return -1;
            }
        }

        return curHealth;
    }

}

