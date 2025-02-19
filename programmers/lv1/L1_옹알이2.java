package programmers.lv1;

public class L1_옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;

        // 가능한 발음들
        String[] possible = {"aya", "ye", "woo", "ma"};

        // 각 단어를 검사
        for (String word : babbling) {
            // 연속된 같은 발음이 있는지 체크
            if (word.contains("ayaaya") || word.contains("yeye") ||
                    word.contains("woowoo") || word.contains("mama")) {
                continue;
            }

            // 가능한 발음들을 특수문자로 치환
            String checkWord = word;
            for (String p : possible) {
                checkWord = checkWord.replace(p, " ");
            }

            // trim()으로 공백을 제거했을 때 길이가 0이면:
            // 모든 문자가 치환되었다면(공백만 남았다면) 발음 가능
            if (checkWord.trim().length() == 0) {
                answer++;
            }
        }

        return answer;
    }

}
