package silver;

import java.io.*;
import java.util.*;


public class Q7785 {

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> employees = new TreeSet<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String status = input[1];

            if(Objects.equals(status, "enter")){
                employees.add(name);
            }else{
                employees.remove(name);
            }
        }

        for(String answer : employees){
            System.out.println(answer);
        }

    }
}
