package programmers.lv2;
import java.util.*;

public class L2_혼자_놀기의_달인 {
    /*나의 풀이*/
//    static boolean [] visited;
//    static int boxNum;
//
//    static void dfs(int idx, int[] cards){
//        int nextIdx = cards[idx]-1;
//
//        if(visited[idx] == false){
//            visited[idx] = true;
//            boxNum ++;
//            dfs(nextIdx, cards);
//        }
//    }
//
//    public int solution(int[] cards) {
//        visited = new boolean[cards.length];
//        List<Integer> list = new ArrayList<>();
//
//        // 임의의 상자를 하나 선택하여 -> idx 0부터 순회해도 됨.
//        // for() 돌면서 dfs (visited 체크해야 함)
//        // 상자의 수를 세고, List에 넣기 vs 바로 계산 -> List에 넣어서 계산
//        for(int i=0; i< cards.length; i++){
//            if(visited[i] == false){
//                boxNum = 1;
//                visited[i] = true;
//
//                int nextIdx = cards[i]-1;
//                dfs(nextIdx, cards);
//                list.add(boxNum);
//            }
//        }
//
//        // 최고 점수를 얻는 방법 더 개선해야 함, cards의 최대 길이가 100이라 시간 복잡도 크게 신경안씀
//        int max = 0;
//        int maxIdx = 0;
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) > max){
//                max = list.get(i);
//                maxIdx = i;
//            }
//        }
//
//        list.remove(maxIdx);
//
//        int maxResult = 0;
//        for(int num : list){
//            if(num*max > maxResult){
//                maxResult = num*max;
//            }
//        }
//        return maxResult;
//    }
    
    /*개선된 풀이*/
    public int solution(int[] cards) {
        int n = cards.length;

        boolean [] visited = new boolean[n];
        List<Integer> groupSizes = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(!visited[i]){
                int size = 0;
                int currentIdx = i;

                while(!visited[currentIdx]){
                    visited[currentIdx] = true;
                    currentIdx = cards[currentIdx] - 1;
                    size ++;
                }
                groupSizes.add(size);
            }
        }

        Collections.sort(groupSizes, Collections.reverseOrder());

        return (groupSizes.size() == 1) ? 0 : groupSizes.get(0) * groupSizes.get(1);

    }
}
