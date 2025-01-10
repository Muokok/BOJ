package silver;

import java.io.*;
import java.util.*;


public class Q1158 { //요세푸스 문제

    /* 잘못된 코드*/
// 이렇게 하려는 이유: 배열의 특정 인덱스를 삭제하고 땡겨오는 과정을 없애고 싶었음
//    static class CircularQueue{
//        int capacity;
//        int jump;
//        int currentSize;
//        int [] queue;
//        int index;
//        List<Integer> answer = new ArrayList<>();
//
//        public CircularQueue(int N, int K){
//            queue = new int[N];
//            this.currentSize = N;
//            this.index = 0;
//            this.jump = K-1;
//            this.capacity = N;
//        }
//
//        void remove(){
//            for(int i=0; i<capacity; i++){
//                if(queue[index] == 1){
//                    while(queue[index] == 1 && currentSize >0){
//                        index = (index + 1) % capacity;
//                    }
//                }
//
//                queue[index] = 1;
//                answer.add(index + 1);
//                currentSize --;
//
//                while(queue[index] == 1 && currentSize >0){
//                    index = (index + 1) % capacity;
//                }
//
//
//                index = (index + jump) % capacity;
//            }
//            // 1 2` 3` 4 5 6` 7`
            // 이 부분에서 잘못됨
//        }
//
//        List<Integer> print(){
//            return answer;
//        }
//    }

    /*수정된 코드*/
    static class JosephusProblem {
        List<Integer> people;
        List<Integer> answer;

        public JosephusProblem(int N) {
            people = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                people.add(i);
            }
            answer = new ArrayList<>();
        }

        void solve(int K) {
            int index = 0;
            while (!people.isEmpty()) {
                index = (index + K - 1) % people.size(); // size()가 작아짐
                answer.add(people.remove(index));
                /*
                    1. K-1을 더하는 이유:
                    우리는 현재 위치에서 시작하여 K번째 사람을 찾아야 합니다.
                    현재 사람을 포함하여 세기 때문에, 실제로 이동해야 하는 거리는 K-1입니다.

                    2. 모듈로 연산 (% people.size())을 사용하는 이유:
                    원형 리스트의 끝에 도달했을 때 다시 처음으로 돌아가야 합니다.
                    모듈로 연산은 이를 자동으로 처리해줍니다.

                    3. 전체 과정:
                    현재 위치 (index)에서 시작합니다.
                    K-1만큼 이동합니다 (index + K - 1).
                    리스트의 크기로 나눈 나머지를 취합니다 (% people.size()).
                */

                /* 에시 */
                // 1. remove(2):3 -> size: 6
                // 2. remove(4):6 -> size: 5
                // 3. remove(1):2 -> size: 4

                // 4. remove(3):7 -> size: 3
                // 5. remove(2):5 -> size: 2
                // 6. remove(0):1 -> size: 1
                // 7. remove(0):4 -> size: 0
                // 1` 2` 3` 4 5` 6` 7`
                // <3, 6, 2, 7, 5, 1, 4>
            }
        }

        List<Integer> getAnswer() {
            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        JosephusProblem jp = new JosephusProblem(N);
        jp.solve(K);

        bw.write("<");
        List<Integer> result = jp.getAnswer();

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));
            if (i < result.size() - 1) {
                bw.write(", ");
            }
        }
        bw.write(">");

        bw.flush();
        bw.close();
        br.close();
    }
}
