package silver;

import java.util.*;
import java.io.*;

public class Q1927 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(minHeap.isEmpty()){
                    sb.append("0\n");
                } else{
                  sb.append(minHeap.poll()).append("\n");
                }
            }else{
                minHeap.add(input);
            }
        }

        System.out.print(sb);
    }
}
