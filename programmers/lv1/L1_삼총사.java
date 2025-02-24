package programmers.lv1;

public class L1_삼총사 {
    public int solution(int[] number) {

      // 3중 for문 돌면서 가능한 모든 경우의 수를 탐색
      // 더해서 0이 되면 result ++
      int answer = 0;

      int leng = number.length;

      for(int i=0; i<leng; i++){
        for(int j=i+1; j<leng; j++){
          for(int l=j+1; l<leng; l++){
            if(number[i] + number[j] + number[l] == 0){
              answer++;
            }
          }
        }
      }

      return answer;
    }
}
