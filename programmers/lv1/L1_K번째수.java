package programmers.lv1;

import java.util.Arrays;

public class L1_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int [] answer = new int[commands.length];

        for(int z=0; z<commands.length; z++){
            // 0번 -> i번째
            // 1번 -> j번째
            // 2번 -> k번째
            int i = commands[z][0] -1;
            int j = commands[z][1];
            int k = commands[z][2];

            int[] slicedArray = Arrays.copyOfRange(array, i, j);
            Arrays.sort(slicedArray);

            answer[z] = slicedArray[k-1];
        }
        return answer;
    }
}
