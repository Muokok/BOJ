package programmers;

import java.util.*;

public class L2_전호번호_목록 {

    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

        for(int i=0; i<phone_book.length; i++){
            set.add(phone_book[i]);
        }

        // 각 전화번호의 가능한 접두어 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
