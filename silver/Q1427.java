package silver;

import java.io.*;
import java.util.*;

public class Q1427 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        Integer [] arr = new Integer [n.length()];

        for(int i=0; i<n.length(); i++){
            arr[i] = n.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int answer : arr){
            System.out.print(answer);
        }

    }
}
