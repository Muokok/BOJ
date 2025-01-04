package silver;

import java.io.*;

public class Q18258 { // 큐 2
    static class CircularQueue{ // 시간초과 나서 원형큐로 변경
        private int [] queue;
        private int capacity;
        private int frontIndex;
        private int rearIndex;
        private int currentSize;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            frontIndex = 0;
            rearIndex = 0;
            currentSize = 0;
        }
        
        public void push(int n){
            if(currentSize == capacity){
                return;
            }
            queue[rearIndex] = n;
            rearIndex = (rearIndex + 1) % capacity;
            currentSize ++;
        }

        public int pop(){
            if(currentSize == 0){
                return -1;
            }
            int result = queue[frontIndex];
            frontIndex = (frontIndex + 1) % capacity;
            currentSize--;
            return result;
        }

        public int size() {
            return currentSize;
        }

        public int empty() {
            return currentSize == 0 ? 1 : 0;
        }

        public int front() {
            return currentSize == 0 ? -1 : queue[frontIndex];
        }

        public int back() {
            return currentSize == 0 ? -1 : queue[(rearIndex - 1 + capacity) % capacity];
        }

    }
/* 시간 초과난 코드 */
//    private static void push(int n, int [] queue){
//        for(int i=0; i<queue.length; i++){
//            if(queue[i] == 0){
//                queue[i] = n;
//                break;
//            }
//        }
//    }
//
//    private static int pop(int [] queue){
//        int returnNum = queue[0];
//
//        if(returnNum == 0){
//            return -1;
//        }else{
//            for(int i=0; i<queue.length - 1; i++){
//                if(queue[i+1] == 0){
//                    queue[i] = queue[i+1];
//                    break;
//                }else if(queue[i+1] == queue[queue.length-1]){
//                    queue[i] = queue[i+1];
//                    queue[i+1] = 0;
//                }
//                queue[i] = queue[i+1];
//            }
//            return returnNum;
//        }
//    }
//
//    private static int size(int [] queue){
//        int size = 0;
//
//        for(int i=0; i<queue.length; i++){
//            if(queue[i] != 0){
//                size++;
//            }
//        }
//        return size;
//    }
//
//    private static int empty(int [] queue){
//        return size(queue) == 0 ? 1:0;
//    }
//
//    private static int front(int [] queue){
//        return queue[0] == 0 ? -1:queue[0];
//    }
//
//    private static int back(int [] queue){
//        for(int i=0; i<queue.length -1; i++){
//            if(queue[i+1] == 0){
//                return queue[i];
//            }
//        }
//        return -1;
//    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        CircularQueue queue = new CircularQueue(N);

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    bw.write(queue.pop() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.empty() + "\n");
                    break;
                case "front":
                    bw.write(queue.front() + "\n");
                    break;
                case "back":
                    bw.write(queue.back() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
