package silver;

import java.io.*;
import java.util.*;

public class Q11279 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(maxHeap.isEmpty()) {
                    sb.append("0\n");
                }
                else{
                    sb.append(maxHeap.poll()).append("\n");
                }
            }else{
                maxHeap.add(input);
            }
        }
        System.out.print(sb);
    }
}
