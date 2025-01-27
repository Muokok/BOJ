package gold;

import java.io.*;
import java.util.*;

public class Q5052 {

    static String check(String [] phones){
        int size = phones.length;

        for(int i=0; i< size-1; i++){
            String first = phones[i];
            String second = phones[i+1];

            if(second.startsWith(first)) return "NO";
        }
        return "YES";
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            String [] phones = new String [n];

            for(int j=0; j<n; j++){
                phones[j] = br.readLine();
            }
            Arrays.sort(phones);

            for(String s : phones){
                System.out.println(s);
            }
            if(i == t-1){
                System.out.print(check(phones));
            }else{
                System.out.println(check(phones));
            }
        }


    }
}
