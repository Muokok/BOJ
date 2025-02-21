package programmers.lv2;
import java.util.*;

public class L2_전화번호_목록_2 {
    public boolean solution(String[] phone_book) {
        // 1. 모든 전화번호를 HashMap에 저장
        Set<String> set = new HashSet<>();
        for (String number : phone_book) {
            set.add(number);
        }

        // 2. 각 전화번호의 모든 접두어가 HashMap에 있는지 확인
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                String prefix = number.substring(0, i);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }

}
