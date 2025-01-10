package programmers;

public class L1_콜라츠_추측 {
    public int solution(int num) {
        if(num == 1) return 0;

        long n = (long)num;
        int cnt = 0;

        while(cnt<500){
            if(n == 1) return cnt;

            if(n % 2 ==0){
                n /= 2;
            }else{
                n = n*3 + 1;
            }
            cnt++;
        }
        return -1;
    }
}
