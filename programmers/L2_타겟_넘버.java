package programmers;

//public class L2_타겟_넘버 { // DFS 풀이법
//    static int answer = 0;
//
//    public static void main(String [] args){
//        /*DFS 풀이를 numbers = [1, 1, 1], target = 1인 경우로 설명*/
//        int [] numbers = {1,1,1};
//        solution(numbers,1);
//        System.out.print(answer);
//    }
//
//    public static int solution(int[] numbers, int target) {
//        dfs(numbers, target, 0, 0);  // 초기 호출
//        return answer;
//    }
//
//    private static void dfs(int[] numbers, int target, int depth, int sum) {
//        if (depth == numbers.length) {  // 마지막 깊이 도달
//            if (sum == target) answer++;
//            return;
//        }
//
//        dfs(numbers, target, depth + 1, sum + numbers[depth]);  // + 선택
//        dfs(numbers, target, depth + 1, sum - numbers[depth]);  // - 선택
//    }
//}

public class L2_타겟_넘버 {


}
