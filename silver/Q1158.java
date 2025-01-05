package silver;

import java.io.*;
import java.util.*;

public class Q1158 { //요세푸스 문제

    static class CircularQueue{
        int capacity;
        int jump;
        int currentSize;
        int [] queue;
        int index;
        List<Integer> answer = new ArrayList<>();


        public CircularQueue(int N, int K){
            queue = new int[N];
            this.currentSize = N;
            this.index = K-1;
            this.jump = K-1;
            this.capacity = N;
        }

        void remove(){
            for(int i=0; i<capacity; i++){
                if(queue[index] != 1){
                    answer.add(index + 1);
                    queue[index] = 1;
                    currentSize --;
                }

                while(queue[index] == 1 && currentSize >=0){
                    index = (index + 1) % capacity;
                }

                if(queue[(index + jump) % capacity] == 1){
                    while(queue[index] == 1 && currentSize >=0){
                        index = (index + 1) % capacity;
                    }
                }

                index =  (index + jump) % capacity;

            }
        }
        // 1 2` 3` 4 5 6` 7

        List<Integer> print(){
            return answer;
        }
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        CircularQueue queue = new CircularQueue(N,K);

        queue.remove();

        bw.write("<");
        for(int num : queue.print()){
            bw.write(num + ", ");
        }
        bw.write(">");

        bw.flush();
        bw.close();
        br.close();
    }
}
