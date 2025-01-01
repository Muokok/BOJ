package silver;

import java.io.*;
import java.util.*;

public class Q14425 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int answer = 0;

        String [] NS = br.readLine().split(" ");

        int N = Integer.parseInt(NS[0]);
        int M = Integer.parseInt(NS[1]);

        for(int i=0; i<N; i++){
            String input = br.readLine();
            set.add(input);
        }

        for(int j=0; j<M; j++){
            String input2 = br.readLine();
            if(set.contains(input2)){
                answer ++;
            }
        }


        System.out.print(answer);


    }
}
