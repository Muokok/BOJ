package silver;

import java.io.*;

public class Q10828 { // 스택

    static class CircularQueue{
        private int [] queue;
        private int index;
        private int capacity;
        private int currentSize;

        public CircularQueue(int capacity){
            queue = new int[capacity];
            this.capacity = capacity;
            this.index = 0;
            this.currentSize = 0;
        }

        void push(int n){
            if(currentSize == capacity){
                return; // full
            }
            queue[index] = n;
            index = (index + 1) % capacity;
            currentSize++;
        }

        int pop(){
            if(currentSize == 0){
                return -1; //none
            }
            int result = queue[index-1];
            index = (capacity + index - 1) % capacity;
            currentSize--;
            return result;
        }

        int size(){
            return currentSize;
        }

        int empty(){
            return currentSize == 0 ? 1:0;
        }

        int top(){
            return currentSize == 0? -1:queue[index-1];
        }
    }



    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        CircularQueue queue = new CircularQueue(N);

        for(int i=0; i<N; i++){
            String [] command = br.readLine().split(" ");

            switch(command[0]){
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
                case "top":
                    bw.write(queue.top() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
