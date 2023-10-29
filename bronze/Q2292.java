package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


        /*
        *
        몇번째 테두리에 있는지 확인
        2,3,4,5,6,7 >> 2번째 테두리 6개 >> 총 6개
        8,9,10,11,12,13,14,15,16,17,18,19 >> 3번째 테두리 12개 총 18개
        20 ~ 37 >> 4번째 테두리  18개 총 36개
        38 ~ 61 >> 5번째 테두리 24개 총 60개
        62 ~ 91 >> 6번째 테두리 30개 총 90개
        * */
        int N = scan.nextInt();
        int minNumPerLine = 2;// 각 라인의 최소값
        int maxNumPerLine = 7;// 각 라인의 최대값
        int line = 2; // 몇 번째 라인인지

        while (true) {
            if(N ==1) { // 이 부분 안해줘서 틀렸었음
                line = 1;
                break;
            }

            if (minNumPerLine <= N && N <= maxNumPerLine) {
                break;
            } else {
                minNumPerLine = maxNumPerLine + 1; // 다음 라인의 최소값은 최대값 + 1
                maxNumPerLine = maxNumPerLine + 6 * line;// 다음 라인의 최대값은 최대값에 라인*6만큼 늘어남
                line++;
            }

        }
        System.out.println(line);
    }
}
