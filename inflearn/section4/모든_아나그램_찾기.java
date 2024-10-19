package inflearn.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 모든_아나그램_찾기 {

    private static int solution(String strS, String strT){
        int result = 0;
        HashMap<Character, Integer> sMap  = new HashMap<>();
        HashMap<Character, Integer> tMap  = new HashMap<>();

        // T문자열의 문자 빈도수 저장
        for(char x : strT.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }

        // 초기 윈도우  설정
        for (int i = 0; i < strT.length()-1; i++) {
            sMap.put(strS.charAt(i), sMap.getOrDefault(strS.charAt(i), 0) + 1);
        }

        // 슬라이딩 윈도우
        int lt = 0;
        for (int rt = strT.length()-1; rt < strS.length(); rt++) {
            // 윈도우의 마지막 문자 추가
            sMap.put(strS.charAt(rt), sMap.getOrDefault(strS.charAt(rt), 0) + 1);

            // 두 맵이 같다면 아나그램
            if(sMap.equals(tMap)) result++;

            // 윈도우의 첫 문자 제거
            sMap.put(strS.charAt(lt), sMap.get(strS.charAt(lt)) - 1);
            if (sMap.get(strS.charAt(lt)) == 0) sMap.remove(strS.charAt(lt));
            lt++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strS = br.readLine();
        String strT = br.readLine();

        System.out.println(solution(strS, strT));
    }
}
