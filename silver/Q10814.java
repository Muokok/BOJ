package silver;

import java.io.*;
import java.util.*;

public class Q10814 {

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [][] arr2 = new String[N][2];

        for(int i=0; i<N; i++){
            String [] input = br.readLine().split(" ");
            arr2[i][0]  = input[0]; // age
            arr2[i][1]  = input[1]; // name
        }

        Arrays.sort(arr2, new Comparator<String[]>(){

            @Override
            public int compare(String [] a, String [] b){
                int age1 = Integer.parseInt(a[0]);
                int age2 = Integer.parseInt(b[0]);

                if(age1 != age2){
                    return Integer.compare(age1, age2);
                }
                return 0; // 나이가 같으면 입력 순서 유지
            }
        });

        for(String[] member : arr2){
            System.out.print(member[0] + " " + member[1] + "\n");
        }
        br.close();
    }
}
