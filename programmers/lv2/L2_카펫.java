package programmers.lv2;

public class L2_카펫 {
    public int[] solution(int brown, int yellow) {
        // 브라운 + 옐로우의 넓이 = area
        // x * y = area 일 때 x와 y의 값의 차이가 가장 적은 x,y를 찾기

        int area = brown + yellow;
        int [] answer = new int[2];

        // 39 = 3*13
        // 2*18.5 or 3*13 or 4*9.75
        for (int height = 3; height <= (int) Math.sqrt(area); height++) {

            if (area % height == 0) {
                int width = area / height;
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }

        return new int[]{-1, -1}; // 해결책을 찾지 못한 경우
    }
}
