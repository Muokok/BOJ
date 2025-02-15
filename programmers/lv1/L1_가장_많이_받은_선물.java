package programmers.lv1;
import java.util.*;

public class L1_가장_많이_받은_선물 {


    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;

        // 친구 이름과 인덱스를 매핑
        Map<String, Integer> friendIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            friendIndexMap.put(friends[i], i);
        }

        // 선물 기록 및 지수 초기화
        int[][] giftRecord = new int[n][n]; // 주고받은 횟수
        int[] giftIndex = new int[n]; // 각 친구의 선물 지수

        // gifts 배열 처리
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            int giverIndex = friendIndexMap.get(giver);
            int receiverIndex = friendIndexMap.get(receiver);

            // 주는 사람과 받는 사람 업데이트
            giftRecord[giverIndex][receiverIndex]++;
            // 각 선물 지수 업데이트
            giftIndex[giverIndex]++;
            giftIndex[receiverIndex]--;
        }

        // 다음 달 받을 선물 개수 계산
        int[] nextMonthGifts = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 자기 자신 제외

                // 주고 받은 횟수로 계산
                if (giftRecord[i][j] > giftRecord[j][i]) {
                    nextMonthGifts[i]++;
                }
                // 선물 지수로 계산
                else if (giftRecord[i][j] == giftRecord[j][i]) {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    }
                }
            }
        }

        // 가장 많은 선물을 받을 친구의 개수 반환
        int maxGifts = 0;
        for (int giftsCount : nextMonthGifts) {
            maxGifts = Math.max(maxGifts, giftsCount);
        }

        return maxGifts;

    }
}
