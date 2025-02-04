package programmers.lv1;

public class L1_부족한_금액_계산하기 {

    public long solution(int price, int money, int count) {

        long sumPrice = 0;

        for(int i=1; i< count+1; i++){
            sumPrice += price*i;
        }

        return sumPrice - money <0 ? 0: sumPrice - money;
    }
}
